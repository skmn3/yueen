package kr.co.sunget.yueen.global.error;

import kr.co.sunget.yueen.global.property.error.ErrorProperties;
import lombok.Getter;

@Getter
public class ErrorResponse {

    private final int status;
    private final String message;

    public ErrorResponse(ErrorProperties errorProperties) {
        this.status = errorProperties.getStatus();
        this.message = errorProperties.getMessage();
    }
}
