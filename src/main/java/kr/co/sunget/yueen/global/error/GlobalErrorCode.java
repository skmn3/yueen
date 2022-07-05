package kr.co.sunget.yueen.global.error;

import kr.co.sunget.yueen.global.property.error.ErrorProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum GlobalErrorCode implements ErrorProperties {

    // 401
    INVALID_TOKEN(401, "유효하지 않은 토큰입니다."),
    USER_CREDENTIALS_NOT_FOUND(401, "유효하지 않은 인증정보입니다."),

    // 403
    FORBIDDEN(403, "접근이 거부되었습니다."),
    NOT_VALID_USER_ROLE(403, "유효하지 않은 사용자 권한입니다."),

    // 404
    IMAGE_NOT_FOUND(404, "사진을 찾을 수 없습니다."),

    // 500
    INTERNAL_SERVER_ERROR(500, "서버 오류");

    private final int status;
    private final String message;
}
