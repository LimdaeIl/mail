package com.book.mail.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor()
public enum ErrorCode implements CInterface {
    NOT_VALID_EMAIL_REQUEST(-1,"잘못된 이메일 형식 입니다.");

    private final Integer code;
    private final String message;

}
