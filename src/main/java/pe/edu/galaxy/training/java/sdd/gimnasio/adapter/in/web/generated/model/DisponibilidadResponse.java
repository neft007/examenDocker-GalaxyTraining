package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DisponibilidadResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class DisponibilidadResponse {

  private UUID claseId;

  private Integer aforoMaximo;

  private Integer reservasConfirmadas;

  private Integer plazasDisponibles;

  public DisponibilidadResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DisponibilidadResponse(UUID claseId, Integer aforoMaximo, Integer reservasConfirmadas, Integer plazasDisponibles) {
    this.claseId = claseId;
    this.aforoMaximo = aforoMaximo;
    this.reservasConfirmadas = reservasConfirmadas;
    this.plazasDisponibles = plazasDisponibles;
  }

  public DisponibilidadResponse claseId(UUID claseId) {
    this.claseId = claseId;
    return this;
  }

  /**
   * Get claseId
   * @return claseId
   */
  @NotNull @Valid 
  @JsonProperty("claseId")
  public UUID getClaseId() {
    return claseId;
  }

  @JsonProperty("claseId")
  public void setClaseId(UUID claseId) {
    this.claseId = claseId;
  }

  public DisponibilidadResponse aforoMaximo(Integer aforoMaximo) {
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

  public DisponibilidadResponse reservasConfirmadas(Integer reservasConfirmadas) {
    this.reservasConfirmadas = reservasConfirmadas;
    return this;
  }

  /**
   * Get reservasConfirmadas
   * @return reservasConfirmadas
   */
  @NotNull 
  @JsonProperty("reservasConfirmadas")
  public Integer getReservasConfirmadas() {
    return reservasConfirmadas;
  }

  @JsonProperty("reservasConfirmadas")
  public void setReservasConfirmadas(Integer reservasConfirmadas) {
    this.reservasConfirmadas = reservasConfirmadas;
  }

  public DisponibilidadResponse plazasDisponibles(Integer plazasDisponibles) {
    this.plazasDisponibles = plazasDisponibles;
    return this;
  }

  /**
   * Get plazasDisponibles
   * @return plazasDisponibles
   */
  @NotNull 
  @JsonProperty("plazasDisponibles")
  public Integer getPlazasDisponibles() {
    return plazasDisponibles;
  }

  @JsonProperty("plazasDisponibles")
  public void setPlazasDisponibles(Integer plazasDisponibles) {
    this.plazasDisponibles = plazasDisponibles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisponibilidadResponse disponibilidadResponse = (DisponibilidadResponse) o;
    return Objects.equals(this.claseId, disponibilidadResponse.claseId) &&
        Objects.equals(this.aforoMaximo, disponibilidadResponse.aforoMaximo) &&
        Objects.equals(this.reservasConfirmadas, disponibilidadResponse.reservasConfirmadas) &&
        Objects.equals(this.plazasDisponibles, disponibilidadResponse.plazasDisponibles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claseId, aforoMaximo, reservasConfirmadas, plazasDisponibles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisponibilidadResponse {\n");
    sb.append("    claseId: ").append(toIndentedString(claseId)).append("\n");
    sb.append("    aforoMaximo: ").append(toIndentedString(aforoMaximo)).append("\n");
    sb.append("    reservasConfirmadas: ").append(toIndentedString(reservasConfirmadas)).append("\n");
    sb.append("    plazasDisponibles: ").append(toIndentedString(plazasDisponibles)).append("\n");
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

