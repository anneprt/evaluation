package com.evaluation.evaluation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonneIntrouvableException extends RuntimeException{
    public PersonneIntrouvableException(String message){
        super(message);
    }
}
