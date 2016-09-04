package com.epam.jmp.spring.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ExtDataResponse extends ExtResponse {


    @JsonProperty("data")
    private final List<Object> data = new ArrayList<>();


    @JsonProperty("total")
    private long total = 0;


    public ExtDataResponse() {
    }


    public ExtDataResponse(Object object) {
        this.add(object);
        this.success = true;
    }


    public ExtDataResponse(Object object, Long total) {
        this.add(object, total);
        this.success = true;
    }


    public void add(Object item) {
        if (item == null) return;


        if (item instanceof Collection) {
            data.addAll((Collection) item);
            total = ((Collection) item).size();
        } else {
            data.add(item);
            total++;
        }
    }


    public void add(Object item, Long total) {
        if (item == null) return;


        if (item instanceof Collection) {
            data.addAll((Collection) item);
        } else {
            data.add(item);
        }
        this.total = total;
    }
}