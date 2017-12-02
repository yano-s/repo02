package com.example.zweb;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EndController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/end", method = RequestMethod.GET)
    public String open(Locale locale, Model model) {
        logger.debug("endが呼ばれました");
        return "end";
    }

    @RequestMapping(value = "/invalidate", method = RequestMethod.GET)
    public String invalidate(Locale locale, Model model, HttpSession session) {
        logger.debug("invalidateが呼ばれました");
        session.invalidate();
        return "redirect:/";
    }

}
