package pe.edu.galaxy.training.java.sdd.gimnasio.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EstadoMembresia
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-24T13:15:51.879846780-06:00[America/Mexico_City]", comments = "Generator version: 7.22.0")
public enum EstadoMembresia {
  
  ACTIVA("ACTIVA"),
  
  VENCIDA("VENCIDA");

  private final String value;

  EstadoMembresia(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EstadoMembresia fromValue(String value) {
    for (EstadoMembresia b : EstadoMembresia.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

