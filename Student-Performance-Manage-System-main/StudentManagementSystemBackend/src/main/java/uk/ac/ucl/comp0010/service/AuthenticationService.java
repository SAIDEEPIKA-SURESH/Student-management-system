package uk.ac.ucl.comp0010.service;

import uk.ac.ucl.comp0010.dto.ResetPasswordDto;

/**
 * Service interface for handling authentication-related operations.
 *
 * <p>This service provides methods to manage authentication processes, such as resetting
 * passwords for users.
 *
 * 
 */

public interface AuthenticationService {

  /**
   * Resets the password for a user based on the provided details.
   *
   * @param resetPasswordDto the DTO containing the user's old and new password information
   */

  void resetPassword(ResetPasswordDto resetPasswordDto);
}
