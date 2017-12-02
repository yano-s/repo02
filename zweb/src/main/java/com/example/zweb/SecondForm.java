package com.example.zweb;

import java.io.Serializable;

public class SecondForm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7107753154959588225L;

    private String secondValue;

    public void setSecondValue(String name) {
        this.secondValue = name;
    }

    public String getSecondValue() {
        return secondValue;
    }
}
