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
@SessionAttributes({ "thirdForm" })
public class ThirdController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ModelAttribute("thirdForm")
    ThirdForm thirdForm() {
        return new ThirdForm();
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/third", method = RequestMethod.GET)
    public String open(Locale locale, Model model) {
        logger.debug("thirdが呼ばれました");
        return "third";
    }

    @RequestMapping(value = "/third", method = RequestMethod.POST)
    public String post(@ModelAttribute("thirdForm") ThirdForm thirdForm) {
        logger.debug("thirdForm.thirdValue = {}", thirdForm.getThirdValue());
        return "redirect:/confirm";
    }

}
