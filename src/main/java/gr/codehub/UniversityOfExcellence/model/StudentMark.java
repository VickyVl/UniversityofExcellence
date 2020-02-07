package gr.codehub.UniversityOfExcellence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 Entity StudentMark with:
 - Two Fields defining the student's attributes and two fields defining the student's mark achieved per course.
 - Fundamental methods/tools imported from Lombok Library.
 Corresponding file: "marks.csv" file located within this project.

 */

public class StudentMark {

    private int id;
    private String name;
    private Course course;
    private double mark;

}
