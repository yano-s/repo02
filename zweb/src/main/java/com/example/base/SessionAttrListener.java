package com.example.base;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@WebListener
public class SessionAttrListener implements HttpSessionAttributeListener{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        logger.debug("【SESSION】Session attributeAdded : {},{}",event.getName(),event.getValue());
    }
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        logger.debug("【SESSION】Session attributeRemoved : {},{}",event.getName(),event.getValue());
    }
    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        logger.debug("【SESSION】Session attributeReplaced : {},{}",event.getName(),event.getValue());
    }
}
