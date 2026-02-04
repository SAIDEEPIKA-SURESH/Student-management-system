package uk.ac.ucl.comp0010.vo;

import lombok.Data;

/**
 * List student Value Object.
 *
 * 
 */

@Data
public class StudentListVo {

  private Integer id;

  /**
   * First name.
   */

  private String firstName;

  /**
   * Last name.
   */
  private String lastName;

  /**
   * email.
   */
  private String email;

  /**
   * program of study.
   */
  private String programOfStudy;
}
