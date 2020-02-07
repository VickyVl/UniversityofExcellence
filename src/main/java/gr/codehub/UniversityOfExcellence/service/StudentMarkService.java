package gr.codehub.UniversityOfExcellence.service;

import gr.codehub.UniversityOfExcellence.model.Course;
import gr.codehub.UniversityOfExcellence.model.StudentMark;
import gr.codehub.UniversityOfExcellence.repository.StudentMarks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Loading of the "marks.csv" file located within this project, which contains
 * the students(id, name) studying at this University and their marks achieved per course(course, mark).
 */

public class StudentMarkService {

    public StudentMarks loadMarks(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        StudentMarks marks = new StudentMarks();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(";");
            StudentMark mark = new StudentMark(Integer.parseInt(words[0]),
                    (words[1]), new Course(words[2]), Double.parseDouble(words[3]));
            marks.add(mark);
        }
        return marks;
    }

    public StudentMark getMarkByIdAndCourse(int id, String courseName) throws FileNotFoundException {
        StudentMarks marks = loadMarks("marks.csv");
        for (StudentMark mark : marks.getMarks())
            if (mark.getId() == id && mark.getCourse().getName().equalsIgnoreCase(courseName))
                return mark;
        return null;
    }

    public StudentMarks getMarksById(int id) throws FileNotFoundException {
        StudentMarks marks = loadMarks("marks.csv");
        StudentMarks result = new StudentMarks();
        for (StudentMark mark : marks.getMarks())
            if (mark.getId() == id)
                result.add(mark);
        return result;
    }
}