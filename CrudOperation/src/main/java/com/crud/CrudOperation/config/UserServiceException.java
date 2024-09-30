package com.crud.CrudOperation.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserServiceException extends RuntimeException{

    public UserServiceException(String msg , Throwable cause){
        super(msg,cause);
    }

    public UserServiceException(String msg){
        super(msg);
    }

}
