package gr.codehub.UniversityOfExcellence.repository;

import gr.codehub.UniversityOfExcellence.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * List of the Students(id, name) studying at this University.
 * Required methods implemented.
 * Corresponding file: "students.csv" file located within this project.
 */

public class Students {

    List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

}
