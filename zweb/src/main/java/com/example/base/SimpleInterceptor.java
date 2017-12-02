package com.example.base;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.zweb.CommonModel;

public class SimpleInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    CommonModel commonModel;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        // logger.debug("preHandle");
        // logger.info("RequestURI : {}", request.getRequestURI());
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            logger.info("Controller : {}.{}", handlerMethod.getBeanType().getName(),
                    handlerMethod.getMethod().getName());
            if ("GET".equals(request.getMethod()) && commonModel != null) {
                logger.debug("counter add");
                commonModel.addCounter();
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // logger.debug("postHandle");
        if (modelAndView != null) {
            modelAndView.getModel().put("commonModel", commonModel);
            
            response.setHeader("X-Frame-Options", "DENY");
            response.setHeader("X-XSS-Protection", "1");
            response.setHeader("X-Content-Type-Options", "nosniff");
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "-1");
            if (!modelAndView.getViewName().startsWith("redirect:")) {
                // TODO MessageのFlashAttribute
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
        MDC.clear();
    }

}