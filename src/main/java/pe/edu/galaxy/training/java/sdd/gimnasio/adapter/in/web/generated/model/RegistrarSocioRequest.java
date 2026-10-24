package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RegistrarSocioRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class RegistrarSocioRequest {

  private String dni;

  private String nombre;

  private String email;

  public RegistrarSocioRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegistrarSocioRequest(String dni, String nombre, String email) {
    this.dni = dni;
    this.nombre = nombre;
    this.email = email;
  }

  public RegistrarSocioRequest dni(String dni) {
    this.dni = dni;
    return this;
  }

  /**
   * Get dni
   * @return dni
   */
  @NotNull @Pattern(regexp = "^\\d{8}$") 
  @JsonProperty("dni")
  public String getDni() {
    return dni;
  }

  @JsonProperty("dni")
  public void setDni(String dni) {
    this.dni = dni;
  }

  public RegistrarSocioRequest nombre(String nombre) {
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

  public RegistrarSocioRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrarSocioRequest registrarSocioRequest = (RegistrarSocioRequest) o;
    return Objects.equals(this.dni, registrarSocioRequest.dni) &&
        Objects.equals(this.nombre, registrarSocioRequest.nombre) &&
        Objects.equals(this.email, registrarSocioRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni, nombre, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarSocioRequest {\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

