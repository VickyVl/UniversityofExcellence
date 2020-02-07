package gr.codehub.UniversityOfExcellence.service;

import gr.codehub.UniversityOfExcellence.model.Student;
import gr.codehub.UniversityOfExcellence.repository.Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Loading of the "students.csv" file located within this project, which contains
 * the students(id, name) studying at this University.
 */

public class StudentService {

    public Students loadStudents(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Students students = new Students();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(";");
            Student student = new Student(Integer.parseInt(words[0]), (words[1]));
            students.add(student);
        }
        return students;
    }
}
