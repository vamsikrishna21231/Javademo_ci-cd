package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMarks {
    private String name;
    private List<Subject> subjects;


//    @Override
//    public String toString() {
//        return
//                 "StudentName="+name+"\n"+
//                "-"+" subjects=" + subjects+"\n"+
//                "Passedsubjects="+(passSubject().isEmpty() ? "None" : passSubject()) + "\n" +
//                "Failed Subjects= " + (failedSubject().isEmpty() ? "None" : failedSubject())+"\n"
//                ;
//    }

        @Override
    public String toString() {
        return "Student: " + name + "\n" +
                "Subjects:\n" +
                subjects.stream()
                        .map(subject -> "- " + subject.getSubjectname() +
                                " (Marks: " + subject.getMarks() +
                                ", Status: " + (subject.passed(passMark) ? "Passed" : "Failed") + ")")
                        .collect(Collectors.joining("\n"));
    }
//@Override
//public String toString() {
//    // Get the passed subjects
//    String passedSubjects = subjects.stream()
//            .filter(subject -> subject.passed(passMark))
//            .map(Subject::getSubjectname)
//            .collect(Collectors.joining(", "));
//
//    // Get the failed subjects
//    String failedSubjects = subjects.stream()
//            .filter(subject -> !subject.passed(passMark))
//            .map(Subject::getSubjectname)
//            .collect(Collectors.joining(", "));
//
//    return "Student: " + name + "\n" +
//            "Passed Subjects: " + (passedSubjects.isEmpty() ? "None" : passedSubjects) + "\n" +
//            "Failed Subjects: " + (failedSubjects.isEmpty() ? "None" : failedSubjects);
//}
    private static final int passMark=35;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubject() {
        return subjects;
    }

    public void setSubjects(List<Subject> subject) {
        this.subjects = subject;
    }

    public StudentMarks(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
//    public  String passSubject(){
//      return subjects.stream()
//                .filter(subject1 -> subject1.passed(passMark))
//                .map(sub->sub.getSubjectname())
//              .collect(Collectors.joining(" ,"));
//
//
//    }
//    public String failedSubject(){
//      return  subjects.stream()
//                .filter(subject1 -> subject1.passed(passMark))
//                .map(sub->sub.getSubjectname())
//                .collect(Collectors.joining(" ,"));
//
//    }
}
