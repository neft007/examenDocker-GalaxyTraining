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
import pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model.EstadoReserva;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReservaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class ReservaResponse {

  private UUID id;

  private UUID socioId;

  private UUID claseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaReserva;

  private EstadoReserva estado;

  public ReservaResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReservaResponse(UUID id, UUID socioId, UUID claseId, OffsetDateTime fechaReserva, EstadoReserva estado) {
    this.id = id;
    this.socioId = socioId;
    this.claseId = claseId;
    this.fechaReserva = fechaReserva;
    this.estado = estado;
  }

  public ReservaResponse id(UUID id) {
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

  public ReservaResponse socioId(UUID socioId) {
    this.socioId = socioId;
    return this;
  }

  /**
   * Get socioId
   * @return socioId
   */
  @NotNull @Valid 
  @JsonProperty("socioId")
  public UUID getSocioId() {
    return socioId;
  }

  @JsonProperty("socioId")
  public void setSocioId(UUID socioId) {
    this.socioId = socioId;
  }

  public ReservaResponse claseId(UUID claseId) {
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

  public ReservaResponse fechaReserva(OffsetDateTime fechaReserva) {
    this.fechaReserva = fechaReserva;
    return this;
  }

  /**
   * Get fechaReserva
   * @return fechaReserva
   */
  @NotNull @Valid 
  @JsonProperty("fechaReserva")
  public OffsetDateTime getFechaReserva() {
    return fechaReserva;
  }

  @JsonProperty("fechaReserva")
  public void setFechaReserva(OffsetDateTime fechaReserva) {
    this.fechaReserva = fechaReserva;
  }

  public ReservaResponse estado(EstadoReserva estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   */
  @NotNull @Valid 
  @JsonProperty("estado")
  public EstadoReserva getEstado() {
    return estado;
  }

  @JsonProperty("estado")
  public void setEstado(EstadoReserva estado) {
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
    ReservaResponse reservaResponse = (ReservaResponse) o;
    return Objects.equals(this.id, reservaResponse.id) &&
        Objects.equals(this.socioId, reservaResponse.socioId) &&
        Objects.equals(this.claseId, reservaResponse.claseId) &&
        Objects.equals(this.fechaReserva, reservaResponse.fechaReserva) &&
        Objects.equals(this.estado, reservaResponse.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, socioId, claseId, fechaReserva, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservaResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    socioId: ").append(toIndentedString(socioId)).append("\n");
    sb.append("    claseId: ").append(toIndentedString(claseId)).append("\n");
    sb.append("    fechaReserva: ").append(toIndentedString(fechaReserva)).append("\n");
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

