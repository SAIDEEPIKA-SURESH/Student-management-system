package uk.ac.ucl.comp0010.exception;

import lombok.Getter;
import uk.ac.ucl.comp0010.response.ResultCode;



@Getter
public class CustomException extends RuntimeException {

  private final ResultCode code;

  public CustomException(ResultCode code, String message) {
    super(message);
    this.code = code;
  }

  public CustomException(String message) {
    super(message);
    this.code = ResultCode.BAD_REQUEST;
  }

}