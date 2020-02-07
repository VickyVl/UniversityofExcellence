package gr.codehub.UniversityOfExcellence.controller;

import gr.codehub.UniversityOfExcellence.model.StudentMark;
import gr.codehub.UniversityOfExcellence.repository.StudentMarks;
import gr.codehub.UniversityOfExcellence.service.StudentMarkService;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

/**
 * StudentMarkController used here to dispatch the data regarding the marks achieved by each student
 * at the University of Excellence, via HTTP responses. Corresponding resource file: "marks.csv" file.
 *
 * Request 1: Insert student id & courseName -> Expected outcome/Expected HTTP Response: to get a specific mark
 * achieved in a specific course by a specific student, hence to retrieve data contained in the "marks.csv" file
 * (id and name of a specific student with his/her mark in the specific course inserted).
 * These should appear as json file on the web.
 *
 * Request 2: Insert student id - > Expected outcome/Expected HTTP Response: to get the marks achieved in all courses
 * that a specific student has chosen, hence to retrieve data contained in the "marks.csv" file
 * (id and name of a specific student and marks achieved in all his/her courses) to appear as json file on the web.
 */

@RestController
public class StudentMarkController {

    @RequestMapping(path = "markPerCourse", method = RequestMethod.GET)
    public StudentMark editAdvert(
            @RequestParam int id,
            @RequestParam String courseName
    ) {
        StudentMarkService sm = new StudentMarkService();
        try {
            return sm.getMarkByIdAndCourse(id, courseName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(path = "marks", method = RequestMethod.GET)
    public StudentMarks editAdvert(
            @RequestParam int id
    ) {
        StudentMarkService sm = new StudentMarkService();
        try {
            return sm.getMarksById(id);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}