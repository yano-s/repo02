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
import org.springframework.web.bind.support.SessionStatus;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({ "firstForm", "secondForm", "thirdForm" })
public class ConfirmController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public String open(Locale locale, Model model) {
        logger.debug("confirmが呼ばれました");
        return "confirm";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String post(@ModelAttribute(name = "firstForm", binding = false) FirstForm firstForm,
            @ModelAttribute(name = "secondForm", binding = false) SecondForm secondForm,
            @ModelAttribute(name = "thirdForm", binding = false) ThirdForm thirdForm,
            SessionStatus sessionStatus) {
        logger.debug("firstForm.firstValue = {}", firstForm.getFirstValue());
        logger.debug("secondForm.secondValue = {}", secondForm.getSecondValue());
        logger.debug("thirdForm.thirdValue = {}", thirdForm.getThirdValue());
        sessionStatus.setComplete();
        return "redirect:/end";
    }

}
