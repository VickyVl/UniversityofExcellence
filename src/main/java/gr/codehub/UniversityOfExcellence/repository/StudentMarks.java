package gr.codehub.UniversityOfExcellence.repository;

import gr.codehub.UniversityOfExcellence.model.StudentMark;

import java.util.ArrayList;
import java.util.List;

/**
 * List of the students(id, name) studying at this University and their marks achieved per course(course, mark).
 * Required methods implemented.
 * Corresponding file: "marks.csv" file located within this project.
 */

public class StudentMarks {

    List<StudentMark> marks;

    public StudentMarks() {
        marks = new ArrayList<>();
    }

    public void add(StudentMark mark) {
        marks.add(mark);
    }

    public List<StudentMark> getMarks() {
        return marks;
    }

}
