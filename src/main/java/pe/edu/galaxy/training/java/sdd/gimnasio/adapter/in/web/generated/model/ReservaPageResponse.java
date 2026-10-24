package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model.ReservaResponse;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReservaPageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public class ReservaPageResponse {

  @Valid
  private List<@Valid ReservaResponse> items = new ArrayList<>();

  private Long totalElements;

  public ReservaPageResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReservaPageResponse(List<@Valid ReservaResponse> items, Long totalElements) {
    this.items = items;
    this.totalElements = totalElements;
  }

  public ReservaPageResponse items(List<@Valid ReservaResponse> items) {
    this.items = items;
    return this;
  }

  public ReservaPageResponse addItemsItem(ReservaResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @NotNull @Valid 
  @JsonProperty("items")
  public List<@Valid ReservaResponse> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid ReservaResponse> items) {
    this.items = items;
  }

  public ReservaPageResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
   */
  @NotNull 
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  @JsonProperty("totalElements")
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservaPageResponse reservaPageResponse = (ReservaPageResponse) o;
    return Objects.equals(this.items, reservaPageResponse.items) &&
        Objects.equals(this.totalElements, reservaPageResponse.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservaPageResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

