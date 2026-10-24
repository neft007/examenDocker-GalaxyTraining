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
 * ReservarPlazaRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class ReservarPlazaRequest {

  private UUID socioId;

  public ReservarPlazaRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReservarPlazaRequest(UUID socioId) {
    this.socioId = socioId;
  }

  public ReservarPlazaRequest socioId(UUID socioId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservarPlazaRequest reservarPlazaRequest = (ReservarPlazaRequest) o;
    return Objects.equals(this.socioId, reservarPlazaRequest.socioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socioId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservarPlazaRequest {\n");
    sb.append("    socioId: ").append(toIndentedString(socioId)).append("\n");
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

