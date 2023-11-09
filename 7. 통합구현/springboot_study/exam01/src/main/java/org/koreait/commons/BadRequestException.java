package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CommonException { //400 예외
    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}