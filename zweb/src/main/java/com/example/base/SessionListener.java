package com.example.base;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class SessionListener implements HttpSessionListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        logger.debug("sessionCreated : {}", event.getSession().getId());

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        logger.debug("sessionDestroyed : {}", event.getSession().getId());

    }
}
