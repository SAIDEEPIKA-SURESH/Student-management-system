package uk.ac.ucl.comp0010.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditModuleDto {

  /**
   * Module Name.
   */

  private String name;

  /**
   * Is the module mandatory non-condonable.
   */

  private Boolean mnc;

  /**
   * Credits.
   */
  private Integer credits;

  /**
   * Teaching Staff id.
   */

  private Integer staffId;

}
