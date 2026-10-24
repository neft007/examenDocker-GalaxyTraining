package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CrearClaseRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class CrearClaseRequest {

  private String nombre;

  private String instructor;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaInicio;

  private Integer duracionMinutos;

  private Integer aforoMaximo;

  public CrearClaseRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CrearClaseRequest(String nombre, String instructor, OffsetDateTime fechaInicio, Integer duracionMinutos, Integer aforoMaximo) {
    this.nombre = nombre;
    this.instructor = instructor;
    this.fechaInicio = fechaInicio;
    this.duracionMinutos = duracionMinutos;
    this.aforoMaximo = aforoMaximo;
  }

  public CrearClaseRequest nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * 3 a 100 caracteres, sin espacios al inicio ni al final.
   * @return nombre
   */
  @NotNull @Pattern(regexp = "^\\S(.*\\S)?$") @Size(min = 3, max = 100) 
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  @JsonProperty("nombre")
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public CrearClaseRequest instructor(String instructor) {
    this.instructor = instructor;
    return this;
  }

  /**
   * 3 a 100 caracteres, sin espacios al inicio ni al final.
   * @return instructor
   */
  @NotNull @Pattern(regexp = "^\\S(.*\\S)?$") @Size(min = 3, max = 100) 
  @JsonProperty("instructor")
  public String getInstructor() {
    return instructor;
  }

  @JsonProperty("instructor")
  public void setInstructor(String instructor) {
    this.instructor = instructor;
  }

  public CrearClaseRequest fechaInicio(OffsetDateTime fechaInicio) {
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

  public CrearClaseRequest duracionMinutos(Integer duracionMinutos) {
    this.duracionMinutos = duracionMinutos;
    return this;
  }

  /**
   * Get duracionMinutos
   * minimum: 1
   * maximum: 180
   * @return duracionMinutos
   */
  @NotNull @Min(value = 1) @Max(value = 180) 
  @JsonProperty("duracionMinutos")
  public Integer getDuracionMinutos() {
    return duracionMinutos;
  }

  @JsonProperty("duracionMinutos")
  public void setDuracionMinutos(Integer duracionMinutos) {
    this.duracionMinutos = duracionMinutos;
  }

  public CrearClaseRequest aforoMaximo(Integer aforoMaximo) {
    this.aforoMaximo = aforoMaximo;
    return this;
  }

  /**
   * Get aforoMaximo
   * minimum: 1
   * maximum: 50
   * @return aforoMaximo
   */
  @NotNull @Min(value = 1) @Max(value = 50) 
  @JsonProperty("aforoMaximo")
  public Integer getAforoMaximo() {
    return aforoMaximo;
  }

  @JsonProperty("aforoMaximo")
  public void setAforoMaximo(Integer aforoMaximo) {
    this.aforoMaximo = aforoMaximo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearClaseRequest crearClaseRequest = (CrearClaseRequest) o;
    return Objects.equals(this.nombre, crearClaseRequest.nombre) &&
        Objects.equals(this.instructor, crearClaseRequest.instructor) &&
        Objects.equals(this.fechaInicio, crearClaseRequest.fechaInicio) &&
        Objects.equals(this.duracionMinutos, crearClaseRequest.duracionMinutos) &&
        Objects.equals(this.aforoMaximo, crearClaseRequest.aforoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, instructor, fechaInicio, duracionMinutos, aforoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearClaseRequest {\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    instructor: ").append(toIndentedString(instructor)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    duracionMinutos: ").append(toIndentedString(duracionMinutos)).append("\n");
    sb.append("    aforoMaximo: ").append(toIndentedString(aforoMaximo)).append("\n");
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

