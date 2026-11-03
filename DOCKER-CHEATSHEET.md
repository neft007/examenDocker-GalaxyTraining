# 🐳 Docker & Docker Compose Cheat Sheet
## Examen Final - Docker & Docker Compose for Developers
### Proyecto: Gimnasio Reservas (Spring Boot + PostgreSQL)

---

## 1. Gestión de Contenedores

### Crear y ejecutar contenedores
```bash
# Crear y ejecutar un contenedor en segundo plano
docker run -d --name mi-contenedor -p 8080:80 nginx

# Crear y ejecutar con variables de entorno
docker run -d --name mi-app -e SPRING_PROFILES_ACTIVE=prod mi-imagen:v1

# Ejecutar un comando dentro de un contenedor ya corriendo
docker exec -it mi-contenedor sh
``` 
### Listar contenedores
```bash
# Listar contenedores en ejecución
docker ps

# Listar TODOS los contenedores (incluidos los detenidos)
docker ps -a
``` 
### Inspeccionar y ver logs
```bash
# Ver detalles completos (IPs, configuración, volúmenes)
docker inspect mi-contenedor

# Ver la IP interna del contenedor
docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mi-contenedor

# Ver logs en tiempo real
docker logs -f mi-contenedor

# Ver las últimas 50 líneas de logs
docker logs --tail 50 mi-contenedor
``` 
### Renombrar, parar y reiniciar
```bash
# Renombrar un contenedor
docker rename viejo-nombre nuevo-nombre

# Detener un contenedor
docker stop mi-contenedor

# Reiniciar un contenedor
docker restart mi-contenedor

# Iniciar un contenedor detenido
docker start mi-contenedor
```
### Eliminar contenedores
```bash
# Eliminar un contenedor (debe estar detenido)
docker rm mi-contenedor

# Eliminación FORZADA (aunque esté corriendo) - Punto 2
docker rm -f mi-contenedor

# Eliminar todos los contenedores detenidos
docker container prune
```

## 2. Gestión de Redes

### Crear y listar redes
```bash
# Crear una red personalizada tipo bridge
docker network create mi-red

# Listar redes disponibles
docker network ls

# Inspeccionar una red (ver contenedores conectados e IPs)
docker network inspect mi-red
``` 
### Conectar y desconectar contenedores
```bash
# Conectar un contenedor existente a una red
docker network connect mi-red mi-contenedor

# Desconectar un contenedor de una red
docker network disconnect mi-red mi-contenedor

# Crear un contenedor directamente en una red
docker run -d --name mi-contenedor --network mi-red nginx
```
### Eliminar redes
```bash
# Eliminar una red (debe no tener contenedores conectados)
docker network rm mi-red

# Eliminar todas las redes no usadas
docker network prune
```
### Probar comunicación entre contenedores
```bash
# Hacer ping entre contenedores usando su nombre (DNS interno de Docker)
docker exec -it gym-api ping -c 2 gym-db
```

## 3. Gestión de Imágenes

### Construir imágenes
```bash
# Construir una imagen desde un Dockerfile
docker build -t mi-usuario/mi-app:v1 .

# Construir sin usar caché (útil para debugging)
docker build --no-cache -t mi-usuario/mi-app:v1 .

# Ver el historial de capas de una imagen (para la sustentación)
docker history mi-usuario/mi-app:v1
```
### Listar e inspeccionar imágenes
```bash
# Listar imágenes locales
docker images

# Ver el tamaño real y comprimido (formato moderno)
docker images --format "table {{.Repository}}\t{{.Tag}}\t{{.Size}}"

# Inspeccionar una imagen (ver usuario, entrypoint, etc.)
docker inspect mi-usuario/mi-app:v1

# Verificar que la imagen NO corre como root
docker inspect mi-usuario/mi-app:v1 --format '{{.Config.User}}'
```
### Etiquetar y subir a registros
```bash
# Etiquetar una imagen
docker tag mi-app:v1 mi-usuario/mi-app:latest

# Login en Docker Hub
docker login

# Subir a Docker Hub
docker push mi-usuario/mi-app:v1

# Subir a AWS ECR
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin <cuenta>.dkr.ecr.us-east-1.amazonaws.com
docker tag mi-app:v1 <cuenta>.dkr.ecr.us-east-1.amazonaws.com/mi-app:v1
docker push <cuenta>.dkr.ecr.us-east-1.amazonaws.com/mi-app:v1
```
### Descargar y eliminar imágenes
```bash
# Descargar una imagen
docker pull mi-usuario/mi-app:v1

# Eliminar una imagen local
docker rmi mi-usuario/mi-app:v1

# Eliminar imágenes no usadas
docker image prune -a
``` 

## 4. Docker Compose

### Levantar y bajar el stack
```bash
# Levantar el stack en segundo plano
docker compose up -d

# Levantar Y reconstruir imágenes (Punto 8: build en caliente)
docker compose up -d --build

# Bajar el stack (mantiene volúmenes)
docker compose down

# Bajar el stack Y eliminar volúmenes (Punto 9: demostrar persistencia)
docker compose down -v
```
### Ver estado y logs
```bash
# Ver el estado de los servicios
docker compose ps

# Ver logs de todos los servicios
docker compose logs -f

# Ver logs de un servicio específico
docker compose logs -f gym-api
```
### Ejecutar comandos en servicios
```bash
# Ejecutar un comando dentro de un servicio
docker compose exec gym-api sh

# Ejecutar un comando de base de datos
docker compose exec gym-db psql -U postgres -d gimnasiodb
```
### Escalar servicios
```bash
# Escalar un servicio a 3 instancias
docker compose up -d --scale gym-worker=3
``` 

## 5. Volúmenes
```bash
# Listar volúmenes
docker volume ls

# Inspeccionar un volumen (ver dónde está almacenado)
docker volume inspect gimnasio-reservas_gym_data

# Crear un volumen manualmente
docker volume create mi-volumen

# Eliminar un volumen
docker volume rm mi-volumen

# Eliminar volúmenes no usados
docker volume prune
``` 

## Demostrar persistencia
```bash
# 1. Levantar el stack y crear un dato
docker compose up -d
# (crear un socio vía API o Adminer)

# 2. Bajar los contenedores SIN borrar volúmenes
docker compose down

# 3. Volver a levantar
docker compose up -d

# 4. Verificar que el dato sigue ahí (Adminer o API)
```

## 6. Secretos

### Uso con Docker Compose
```bash
# En docker-compose.yml
services:
  mi-servicio:
    secrets:
      - db_password

secrets:
  db_password:
    file: ./db_password.txt
```
```bash
# Crear el archivo de secreto
echo "MiPasswordSeguro123" > db_password.txt

# Verificar que NO está en Git
git status | grep db_password
# (no debe aparecer)
```
### Uso con Docker Swarm
```bash
# Inicializar Swarm
docker swarm init

# Crear un secreto
echo "MiPassword" | docker secret create db_password -

# Listar secretos
docker secret ls

# Usar en un servicio
docker service create --name mi-app --secret db_password mi-imagen:v1
```

## 7. Seguridad

### Escaneo de vulnerabilidades
```bash
# Escaneo rápido con Docker Scout
docker scout quickview mi-usuario/mi-app:v1

# Ver CVEs detallados
docker scout cves mi-usuario/mi-app:v1

# Recomendaciones de actualización
docker scout recommendations mi-usuario/mi-app:v1
```
### Buenas prácticas en Dockerfile
```bash
# ✅ Usar multi-stage build
FROM maven:3.9-eclipse-temurin-17-alpine AS builder
# ... compilación ...
FROM eclipse-temurin:17-jre-alpine
# ... runtime ...

# ✅ Crear usuario no-root
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# ✅ Usar imágenes ligeras (Alpine)
FROM eclipse-temurin:17-jre-alpine

# ✅ JVM flags para contenedores
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0"
```
### Aislamiento de red
```bash
# ✅ NO exponer puertos innecesarios al host
# En docker-compose.yml, la BD NO debe tener "ports:"
# ✅ Usar redes personalizadas
# ✅ Comunicación por nombre, no por IP
``` 

## 8. Limpieza y Diagnóstico
```bash
# Ver uso de disco de Docker
docker system df

# Limpiar TODO lo no usado (contenedores, imágenes, redes, caché)
docker system prune -a

# Limpiar solo volúmenes no usados
docker volume prune

# Ver estadísticas de recursos en tiempo real
docker stats

# Ver procesos dentro de un contenedor
docker top mi-contenedor
``` 
## 9. Registros de Imágenes

### Docker Hub
```bash
# Login en Docker Hub
docker login

# Etiquetar una imagen para Docker Hub
docker tag mi-imagen:latest mi-usuario/mi-imagen:v1

# Subir a Docker Hub
docker push mi-usuario/mi-imagen:v1
docker push mi-usuario/mi-imagen:latest

# Descargar desde Docker Hub
docker pull mi-usuario/mi-imagen:v1

# Ver las imágenes publicadas
# https://hub.docker.com/r/mi-usuario/mi-imagen
``` 
### GitHub Container Registry 
```bash
# Login en ghcr.io (usar token de GitHub con scope write:packages)
echo "TU_TOKEN" | docker login ghcr.io -u mi-usuario --password-stdin

# Etiquetar una imagen para ghcr.io
docker tag mi-imagen:v1 ghcr.io/mi-usuario/mi-imagen:v1

# Subir a ghcr.io
docker push ghcr.io/mi-usuario/mi-imagen:v1

# Descargar desde ghcr.io
docker pull ghcr.io/mi-usuario/mi-imagen:v1

# Ver las imágenes publicadas
# https://github.com/mi-usuario?tab=packages
``` 
### Verificar que la imagen descargada funciona
```bash
# Eliminar la imagen local
docker rmi mi-usuario/mi-imagen:v1

# Descargar desde el registro
docker pull mi-usuario/mi-imagen:v1

# Ejecutar un contenedor con la imagen descargada
docker run --rm -p 8080:8080 mi-usuario/mi-imagen:v1
``` 

## 10. Comandos usados en este proyecto
### Gestión de contenedores
```bash
# Crear y ejecutar un contenedor
docker run -d --name gym-api -p 8080:8080 neft007/gym-reservas-api:latest

# Listar contenedores
docker ps
docker ps -a

# Ver logs
docker logs -f gym-api

# Inspeccionar un contenedor (ver IP interna)
docker inspect gym-api
docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' gym-api

# Detener, reiniciar, eliminar
docker stop gym-api
docker restart gym-api
docker rm gym-api
docker rm -f gym-api  # Eliminación forzada
``` 
### Redes
```bash
# Crear red
docker network create gym-network

# Listar redes
docker network ls

# Inspeccionar red (ver contenedores conectados)
docker network inspect gimnasio-reservas_docker_gym-network

# Conectar/desconectar contenedores
docker network connect gym-network gym-api
docker network disconnect gym-network gym-api
``` 
### Imágenes
```bash
# Construir imagen
docker build -t neft007/gym-reservas-api:v1 .

# Listar imágenes
docker images

# Ver historial de capas (multi-stage)
docker history neft007/gym-reservas-api:v1

# Verificar que NO corre como root
docker inspect neft007/gym-reservas-api:v1 --format '{{.Config.User}}'
# → appuser
```
### Docker Compose
```bash
# Levantar el stack
docker compose up -d

# Levantar y reconstruir (build en caliente)
docker compose up -d --build

# Ver estado
docker compose ps

# Ver logs
docker compose logs -f gym-api

# Bajar el stack (mantiene volúmenes)
docker compose down

# Bajar y eliminar volúmenes (cuidado: borra datos)
docker compose down -v
```
### Volúmenes
```bash
# Listar volúmenes
docker volume ls

# Inspeccionar volumen
docker volume inspect gimnasio-reservas_docker_gym_data

# Eliminar volumen
docker volume rm gimnasio-reservas_docker_gym_data
```
### Secretos
```bash
# Verificar que el secreto está montado en el contenedor
docker exec -it gym-api ls -la /run/secrets/

# Ver el contenido (sin exponerlo en la sustentación)
docker exec -it gym-api cat /run/secrets/db_password
```
### Limpieza
```bash
# Ver uso de disco
docker system df

# Limpiar todo lo no usado
docker system prune -a

# Limpiar contenedores detenidos
docker container prune -f

# Limpiar imágenes no usadas
docker image prune -f
```
### Seguridad
```bash
# Escaneo de vulnerabilidades con Docker Scout
docker scout quickview neft007/gym-reservas-api:latest
docker scout cves neft007/gym-reservas-api:latest

# Verificar que la BD NO tiene puertos expuestos al host
docker compose ps
# (la columna PORTS de gym-db debe estar vacía o solo mostrar 5432/tcp sin 0.0.0.0)
```
## 11. Comandos de diagnóstico rápido
```bash
# Verificar que la API conectó a la BD
docker compose logs gym-api | grep "HikariPool-1 - Start completed"

# Verificar que Hibernate creó las tablas
docker compose logs gym-api | grep "Initialized JPA EntityManagerFactory"

# Verificar que la API está healthy
docker compose ps | grep healthy

# Probar comunicación entre contenedores
docker exec -it gym-api ping -c 2 gym-db

# Probar endpoint de health
curl http://localhost:8080/actuator/health
```