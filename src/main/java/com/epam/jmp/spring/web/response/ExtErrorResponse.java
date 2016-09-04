package com.epam.jmp.spring.web.response;

import com.epam.jmp.spring.log.LoggingExceptions;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ExtErrorResponse extends ExtResponse {


    @JsonProperty("exception")
    private String exception = null;


    public ExtErrorResponse(String message) {
        super(false, message);
    }


    public ExtErrorResponse(String message, Throwable throwable) {
        super(false, message);
        if (throwable != null) {
            this.exception = LoggingExceptions.getLogException(throwable);
        }
    }
}