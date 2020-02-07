package gr.codehub.UniversityOfExcellence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * WelcomeHomepageController used here to dispatch the data from the "welcome.html" file, in order to
 * create the welcoming page of the University of Excellence.
 * Formatting of the Welcome Homepage completed with HTML and CSS,
 * in order to add color and hoverable buttons in the page, which lead to landing pages/HTTP responses
 * defined by the other Controllers.
 */

@RestController
public class WelcomeHomepageController {

    @GetMapping("welcome")
    public ModelAndView getWelcomeHomepageController() {
        return new ModelAndView("welcome.html");
    }

    @GetMapping("LoginFormForMarkPerCourse")
    public ModelAndView LoginFormForMarkPerCourse() {
        return new ModelAndView("LoginFormForMarkPerCourse.html");
    }

    @GetMapping("LoginFormForMarks")
    public ModelAndView LoginFormForMarks() {
        return new ModelAndView("LoginFormForMarks.html");
    }

}