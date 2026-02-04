package uk.ac.ucl.comp0010.vo;

import lombok.Data;

/**
 * Value Object for showing information of Staffs.
 *
 * 
 */
@Data
public class StaffListVo {

  /**
   * ID.
   */
  private Integer id;

  /**
   * First name.
   */

  private String firstName;

  /**
   * Last name Not Null.
   */
  private String lastName;

  /**
   * email.
   */
  private String email;

  /**
   * title.
   */
  private String title;

  /**
   * department.
   */
  private String department;
}
