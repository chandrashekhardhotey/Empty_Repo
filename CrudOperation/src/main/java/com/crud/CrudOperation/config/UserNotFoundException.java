package com.crud.CrudOperation.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String msg , Throwable cause){
        super(msg,cause);
    }

    public UserNotFoundException(String msg){
        super(msg);
    }
}
