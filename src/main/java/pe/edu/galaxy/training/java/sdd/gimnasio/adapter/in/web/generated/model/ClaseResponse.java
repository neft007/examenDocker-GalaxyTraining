package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model.EstadoClase;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ClaseResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class ClaseResponse {

  private UUID id;

  private String nombre;

  private String instructor;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaInicio;

  private Integer duracionMinutos;

  private Integer aforoMaximo;

  private EstadoClase estado;

  public ClaseResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClaseResponse(UUID id, String nombre, String instructor, OffsetDateTime fechaInicio, Integer duracionMinutos, Integer aforoMaximo, EstadoClase estado) {
    this.id = id;
    this.nombre = nombre;
    this.instructor = instructor;
    this.fechaInicio = fechaInicio;
    this.duracionMinutos = duracionMinutos;
    this.aforoMaximo = aforoMaximo;
    this.estado = estado;
  }

  public ClaseResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Valid 
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  public ClaseResponse nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   */
  @NotNull 
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  @JsonProperty("nombre")
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ClaseResponse instructor(String instructor) {
    this.instructor = instructor;
    return this;
  }

  /**
   * Get instructor
   * @return instructor
   */
  @NotNull 
  @JsonProperty("instructor")
  public String getInstructor() {
    return instructor;
  }

  @JsonProperty("instructor")
  public void setInstructor(String instructor) {
    this.instructor = instructor;
  }

  public ClaseResponse fechaInicio(OffsetDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  /**
   * Get fechaInicio
   * @return fechaInicio
   */
  @NotNull @Valid 
  @JsonProperty("fechaInicio")
  public OffsetDateTime getFechaInicio() {
    return fechaInicio;
  }

  @JsonProperty("fechaInicio")
  public void setFechaInicio(OffsetDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public ClaseResponse duracionMinutos(Integer duracionMinutos) {
    this.duracionMinutos = duracionMinutos;
    return this;
  }

  /**
   * Get duracionMinutos
   * @return duracionMinutos
   */
  @NotNull 
  @JsonProperty("duracionMinutos")
  public Integer getDuracionMinutos() {
    return duracionMinutos;
  }

  @JsonProperty("duracionMinutos")
  public void setDuracionMinutos(Integer duracionMinutos) {
    this.duracionMinutos = duracionMinutos;
  }

  public ClaseResponse aforoMaximo(Integer aforoMaximo) {
    this.aforoMaximo = aforoMaximo;
    return this;
  }

  /**
   * Get aforoMaximo
   * @return aforoMaximo
   */
  @NotNull 
  @JsonProperty("aforoMaximo")
  public Integer getAforoMaximo() {
    return aforoMaximo;
  }

  @JsonProperty("aforoMaximo")
  public void setAforoMaximo(Integer aforoMaximo) {
    this.aforoMaximo = aforoMaximo;
  }

  public ClaseResponse estado(EstadoClase estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   */
  @NotNull @Valid 
  @JsonProperty("estado")
  public EstadoClase getEstado() {
    return estado;
  }

  @JsonProperty("estado")
  public void setEstado(EstadoClase estado) {
    this.estado = estado;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaseResponse claseResponse = (ClaseResponse) o;
    return Objects.equals(this.id, claseResponse.id) &&
        Objects.equals(this.nombre, claseResponse.nombre) &&
        Objects.equals(this.instructor, claseResponse.instructor) &&
        Objects.equals(this.fechaInicio, claseResponse.fechaInicio) &&
        Objects.equals(this.duracionMinutos, claseResponse.duracionMinutos) &&
        Objects.equals(this.aforoMaximo, claseResponse.aforoMaximo) &&
        Objects.equals(this.estado, claseResponse.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, instructor, fechaInicio, duracionMinutos, aforoMaximo, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaseResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    instructor: ").append(toIndentedString(instructor)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    duracionMinutos: ").append(toIndentedString(duracionMinutos)).append("\n");
    sb.append("    aforoMaximo: ").append(toIndentedString(aforoMaximo)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

