package com.example.zweb;

import java.io.Serializable;

public class ThirdForm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7107753154959588225L;

    private String thirdValue;

    public void setThirdValue(String name) {
        this.thirdValue = name;
    }

    public String getThirdValue() {
        return thirdValue;
    }
}
