package gr.codehub.UniversityOfExcellence.controller;

import gr.codehub.UniversityOfExcellence.model.Student;
import gr.codehub.UniversityOfExcellence.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * CourseController used here to dispatch the data regarding the students
 * studying at the University of Excellence, i.e. the students listed by their id and name, via the HTTP response.
 * Expected outcome/HTTP Response: to retrieve data contained in the "students.csv" file (id and name of all students)
 * to appear as json file on the web.
 */

@RestController
public class StudentController {

    @GetMapping("students")
    public List<Student> getStudentsController() {
        StudentService ss = new StudentService();
        try {
            return ss.loadStudents("students.csv").getStudents();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
