package gr.codehub.UniversityOfExcellence.service;

import gr.codehub.UniversityOfExcellence.model.Course;
import gr.codehub.UniversityOfExcellence.repository.Courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
Loading of the "courses.csv" file located within this project, which contains
the names of all courses provided by this University.

*/

public class CourseService {

    public Courses loadCourses(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Courses courses = new Courses();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(";");
            Course course = new Course(words[0]);
            courses.add(course);
        }
        return courses;
    }
}
