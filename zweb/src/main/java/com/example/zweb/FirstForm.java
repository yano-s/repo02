package com.example.zweb;

import java.io.Serializable;

public class FirstForm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7107753154959588225L;

    private String firstValue;

    public void setFirstValue(String name) {
        this.firstValue = name;
    }

    public String getFirstValue() {
        return firstValue;
    }
}
