package gr.codehub.UniversityOfExcellence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 *  Entity Course defining each course provided by this University,
 *  with name field and fundamental methods/tools imported from Lombok Library.
 *  Corresponding file: "courses.csv" file located within this project.
 */

public class Course {

    private String name;

}
