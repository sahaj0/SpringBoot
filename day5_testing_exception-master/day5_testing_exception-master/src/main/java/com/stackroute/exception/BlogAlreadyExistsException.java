package com.stackroute.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BlogAlreadyExistsException extends RuntimeException {
    public BlogAlreadyExistsException(String message) {
        super(message);
    }
}
