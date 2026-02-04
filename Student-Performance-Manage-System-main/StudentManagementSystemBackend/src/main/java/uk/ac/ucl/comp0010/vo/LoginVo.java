package uk.ac.ucl.comp0010.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Login Data to return.
 *
 * 
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginVo {

  private String accessToken;

  private String refreshToken;

}
