package com.example.zweb;

import java.util.Locale;

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
@SessionAttributes({ "firstForm", })
public class FirstController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ModelAttribute("firstForm")
    FirstForm firstForm() {
        return new FirstForm();
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String open(Locale locale, Model model) {
        logger.debug("firstが呼ばれました");
        return "first";
    }

    @RequestMapping(value = "/first", method = RequestMethod.POST)
    public String post(@ModelAttribute("firstForm") FirstForm firstForm) {
        logger.debug("firstForm.firstValue = {}", firstForm.getFirstValue());
        return "redirect:/second";
    }

}
