package com.epam.jmp.spring.web.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class ExtResponse implements IExtResponse {


    public final static ExtResponse SUCCESS = new ExtResponse(true, null);


    protected String message = null;


    protected boolean success = false;


    public ExtResponse() {
    }


    public ExtResponse(boolean success) {
        this(success, null);
    }


    public ExtResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }


    public boolean getSuccess() {
        return success;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


}