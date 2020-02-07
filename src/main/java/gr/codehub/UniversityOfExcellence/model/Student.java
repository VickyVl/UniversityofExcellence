package gr.codehub.UniversityOfExcellence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 Entity Student defining each Student studying at this University,
 with fields and fundamental methods/tools imported from Lombok Library.
 Corresponding file: "students.csv" file located within this project.

 */

public class Student {

    private int id;
    private String name;

}
