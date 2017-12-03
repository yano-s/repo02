package com.example.zweb;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({ "secondForm" })
public class SecondController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ModelAttribute("secondForm")
    SecondForm secondForm() {
        return new SecondForm();
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/second", method = RequestMethod.GET)
    public String open(Locale locale, Model model, HttpServletRequest request) {
        logger.debug("secondが呼ばれました");
//         logger.debug("session={}",request.getSession().getClass().getName());
//         logger.debug("sessionId={}",request.getSession().getId());
//         request.getSession().invalidate();
//         logger.debug("Session がinvalidateされました。");
//         logger.debug("sessionId={}",request.getSession().getId());
        return "second";
    }

    @RequestMapping(value = "/second", method = RequestMethod.POST)
    public String post(@ModelAttribute("secondForm") SecondForm secondForm) {
        logger.debug("secondForm.secondValue = {}", secondForm.getSecondValue());
        return "redirect:/third";
    }

}
