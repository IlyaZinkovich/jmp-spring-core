package com.epam.jmp.spring.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ExtObjectResponse extends ExtResponse {


    @JsonProperty("data")
    private Object data;


    public ExtObjectResponse() {
    }


    public ExtObjectResponse(Object object) {
        this.data = object;
        this.success = true;
    }


}
