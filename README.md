# Project Title: University of Excellence

## Project Description and Purpose:

In this Project, I used Java Spring to dispatch the data of a specific University via HTTP responses.

For that, I created a fictional University, naming it "UOE: The University of Excellence". 

The students of this University are historical and prominent figures of the past, from various scientific fields, 
such as Alan Turing, Plato, Marie Curie, Nikola Tesla, Friedrich Nietzsche, in order to honour
their contribution to human history (this also justifies the facts in the welcoming page of the program as it appears 
on the web, stating that the university was established in Meritland in 723AD by Duchess Laudable I of Meritland).

The courses provided by this University are diverse; from Computer Engineering to Philosophy.

The purpose of this Java Spring Project is to display via URIs on the web:

1. the welcoming page of the University
2. the students studying at this University
3. the courses provided by this University
4. the mark achieved by a specific student in a course
5. the marks achieved by a specific student in all courses he/she has chosen.
6. display all the above: Create a welcoming web page with the respective landing pages,
designing an interactive environment with user-friendly navigational links.    

In this Project, the following were defined:

- each student by id and name,
- each course by its name,
- each mark achieved in each course by id and name of the student, course and mark achieved.

Then, lists were created for the three classes described above in the repository.

The next step was to create the Service for each one of the three entities. For that purpose, I used three csv files:
1. students.csv
2. courses.csv
3. marks.csv

Each file was uploaded within the corresponding Service, where the required methods were implemented according to 
the purposes of this project.

In order to create the welcoming page of the University and its landing pages, three HTML files were created using 
HTML and CSS formatting. The respective files were:
1.welcome.html
2.LoginFormForMarkPerCourse
3.LoginFormForMarks

Finally, the Controllers were used to dispatch the data via HTTP responses, in order to fulfill the purpose of the
project and get the desired results deriving from the sixfold aspect of this purpose as described above,
which was to display a welcoming page of the University, the students of the University, the courses provided, 
the mark achieved by a specific student in a specific course, as well as all marks achieved by a specific student 
in all his/her courses and display the data retrieved from the aforementioned files as json files on the web,
via a user-friendly, interactive web environment. 

## Running the application locally

In order to run this Spring Boot application on your local machine, you can execute 
the main method in the gr.codehub.UniversityOfExcellence.UniversityOfExcellenceApplication class from your IDE.

If you would like to see how the results shall appear on the web, please: 
@see README.pdf presentation, which contains screenshots of the results.