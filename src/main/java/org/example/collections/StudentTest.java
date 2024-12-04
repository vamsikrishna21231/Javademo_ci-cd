package org.example.collections;

import java.util.*;

public class StudentTest {
     public static void main(String[] args) {
//
//         List<SubjectName> marks=new ArrayList<>();
//         SubjectName vamsi=new SubjectName(34,31,45,75);
//         SubjectName bhavi=new SubjectName(34,31,45,75);
//         SubjectName kishore=new SubjectName(34,31,45,75);
//         SubjectName rahul=new SubjectName(34,31,45,75);
//         marks.add(vamsi);
//         marks.add(bhavi);
//         marks.add(kishore);
//         marks.add(rahul);



         List<Subject> vamsiSubjects= Arrays.asList(
                 new Subject("maths",35),
                 new Subject("telugu",35),
                 new Subject("hindi",45)
         );
         List<Subject> bhaviSubjects= Arrays.asList(
                 new Subject("maths",35),
                 new Subject("telugu",35),
                 new Subject("hindi",45)
         );
         List<Subject> kishoreSubjects= Arrays.asList(
                 new Subject("maths",75),
                 new Subject("telugu",25),
                 new Subject("hindi",65)
         );
         List<Subject> rahulSubjects= Arrays.asList(
                 new Subject("maths",85),
                 new Subject("telugu",15),
                 new Subject("hindi",22)
         );


         Map<String,StudentMarks> details=new HashMap<>();
    StudentMarks marks1=new StudentMarks("vamsi",  vamsiSubjects);
      StudentMarks marks2=new StudentMarks("rahul",rahulSubjects);
        StudentMarks marks3=new StudentMarks("bhavi",bhaviSubjects);
        StudentMarks marks4=new StudentMarks("kishore",kishoreSubjects);
         details.put(marks1.getName(), marks1);
         details.put(marks2.getName(), marks2);
         details.put(marks3.getName(), marks3);
         details.put(marks3.getName(), marks4);

        details.values().stream()
//                .flatMap(O1,O2->)
                .forEach(System.out::println);




    }
}
