# ============================================================
# ETAPA 1: Compilación (Build)
# ============================================================
FROM maven:3.9-eclipse-temurin-17-alpine AS builder
WORKDIR /app

# Copiamos primero el pom.xml para aprovechar la caché de capas
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiamos el código fuente y compilamos
COPY src ./src
RUN mvn clean package -DskipTests

# ============================================================
# ETAPA 2: Ejecución (Runtime)
# ============================================================
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Seguridad: Crear grupo y usuario sin privilegios
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Copiar el JAR generado desde la etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Cambiar la propiedad del archivo al usuario no-root
RUN chown appuser:appgroup app.jar

# Cambiamos al usuario sin privilegios (NO root)
USER appuser

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# JVM flags para contenedores (eficiencia de memoria)
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0"

# Comando de arranque
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]