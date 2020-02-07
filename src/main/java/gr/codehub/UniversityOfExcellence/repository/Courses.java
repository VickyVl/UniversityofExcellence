package gr.codehub.UniversityOfExcellence.repository;

import gr.codehub.UniversityOfExcellence.model.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * List of the Courses(name) provided by this University. Required methods implemented.
 * Corresponding file: "courses.csv" file located within this project.
 */


public class Courses {

    List<Course> courses;

    public Courses() {
        courses = new ArrayList<>();
    }

    public void add(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

}
