package kr.co.sunget.yueen.global.enums;

import kr.co.sunget.yueen.global.exception.InvalidRoleException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum UserRole {
    ADMIN("관리자", "ROLE_ADMIN"),
    USER("일반 사용자", "ROLE_USER");

    private final String key;
    private final String value;

    public static UserRole of(String key) {
       return Arrays.stream(UserRole.values())
               .filter(userRole -> userRole.getKey().equals(key))
               .findAny()
               .orElseThrow(() -> InvalidRoleException.EXCEPTION);
    }
}
