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
import pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model.EstadoMembresia;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SocioResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class SocioResponse {

  private UUID id;

  private String dni;

  private String nombre;

  private String email;

  private EstadoMembresia membresia;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaAlta;

  public SocioResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SocioResponse(UUID id, String dni, String nombre, String email, EstadoMembresia membresia, OffsetDateTime fechaAlta) {
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
    this.email = email;
    this.membresia = membresia;
    this.fechaAlta = fechaAlta;
  }

  public SocioResponse id(UUID id) {
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

  public SocioResponse dni(String dni) {
    this.dni = dni;
    return this;
  }

  /**
   * Get dni
   * @return dni
   */
  @NotNull 
  @JsonProperty("dni")
  public String getDni() {
    return dni;
  }

  @JsonProperty("dni")
  public void setDni(String dni) {
    this.dni = dni;
  }

  public SocioResponse nombre(String nombre) {
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

  public SocioResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull 
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  public SocioResponse membresia(EstadoMembresia membresia) {
    this.membresia = membresia;
    return this;
  }

  /**
   * Get membresia
   * @return membresia
   */
  @NotNull @Valid 
  @JsonProperty("membresia")
  public EstadoMembresia getMembresia() {
    return membresia;
  }

  @JsonProperty("membresia")
  public void setMembresia(EstadoMembresia membresia) {
    this.membresia = membresia;
  }

  public SocioResponse fechaAlta(OffsetDateTime fechaAlta) {
    this.fechaAlta = fechaAlta;
    return this;
  }

  /**
   * Get fechaAlta
   * @return fechaAlta
   */
  @NotNull @Valid 
  @JsonProperty("fechaAlta")
  public OffsetDateTime getFechaAlta() {
    return fechaAlta;
  }

  @JsonProperty("fechaAlta")
  public void setFechaAlta(OffsetDateTime fechaAlta) {
    this.fechaAlta = fechaAlta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocioResponse socioResponse = (SocioResponse) o;
    return Objects.equals(this.id, socioResponse.id) &&
        Objects.equals(this.dni, socioResponse.dni) &&
        Objects.equals(this.nombre, socioResponse.nombre) &&
        Objects.equals(this.email, socioResponse.email) &&
        Objects.equals(this.membresia, socioResponse.membresia) &&
        Objects.equals(this.fechaAlta, socioResponse.fechaAlta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dni, nombre, email, membresia, fechaAlta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    membresia: ").append(toIndentedString(membresia)).append("\n");
    sb.append("    fechaAlta: ").append(toIndentedString(fechaAlta)).append("\n");
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

