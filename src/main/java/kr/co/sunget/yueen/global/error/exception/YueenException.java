package kr.co.sunget.yueen.global.error.exception;

import kr.co.sunget.yueen.global.property.error.ErrorProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class YueenException extends RuntimeException {

    private final ErrorProperties errorProperties;
}
