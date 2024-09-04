package com.book.mail.common.exception;

import com.book.mail.common.code.CInterface;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private final CInterface codeInterface;

    public CustomException(CInterface codeInterface) {
        super(codeInterface.getMessage());
        this.codeInterface = codeInterface;
    }

    public CustomException(CInterface codeInterface, String additionalMessage) {
        super(codeInterface.getMessage() + additionalMessage);
        this.codeInterface = codeInterface;
    }
}
