package gr.codehub.UniversityOfExcellence.controller;

import gr.codehub.UniversityOfExcellence.model.Course;
import gr.codehub.UniversityOfExcellence.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * CourseController used here to dispatch the data regarding the courses
 * provided by the University of Excellence, i.e. the courses listed by their name, via the HTTP response.
 * Expected outcome/HTTP Response: to retrieve data contained in the "courses.csv" file (name of the courses)
 * to appear as json file on the web.
 */

@RestController
public class CourseController {

    @GetMapping("courses")
    public List<Course> getCoursesController() {
        CourseService cs = new CourseService();
        try {
            return cs.loadCourses("courses.csv").getCourses();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}