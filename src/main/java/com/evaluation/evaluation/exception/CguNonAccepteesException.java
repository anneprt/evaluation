package com.evaluation.evaluation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CguNonAccepteesException extends RuntimeException{
    public CguNonAccepteesException(String message) {
        super(message);
    }
}
