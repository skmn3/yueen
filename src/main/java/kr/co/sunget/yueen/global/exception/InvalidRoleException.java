package kr.co.sunget.yueen.global.exception;

import kr.co.sunget.yueen.global.error.GlobalErrorCode;
import kr.co.sunget.yueen.global.error.exception.YueenException;

public class InvalidRoleException  extends YueenException {

    public static final YueenException EXCEPTION =
            new InvalidRoleException();

    private InvalidRoleException() {
        super(GlobalErrorCode.NOT_VALID_USER_ROLE);
    }
}
