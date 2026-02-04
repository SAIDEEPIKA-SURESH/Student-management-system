package uk.ac.ucl.comp0010.model;

import lombok.Data;
import uk.ac.ucl.comp0010.enums.AccountType;

/**
 * Login Entity for logged-in users.
 *
 *
 */
@Data
public class LoginEntity {

  private Integer id;
  private AccountType accountType;

}
