package com.stackroute.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException(String message) {
        super(message);
    }
}