package com.example.zweb;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CommonModel implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 7771052320446862882L;

    private int counter = 0;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void addCounter() {
        this.counter++;
    }
}
