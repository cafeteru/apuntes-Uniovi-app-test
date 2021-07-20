package es.uniovi.apuntesuniovi.model;

import lombok.Builder;
import lombok.Data;

/**
 * Model to save alerts information
 */
@Data
@Builder
public class SweetAlert {
  private String title;
  private String content;
}
