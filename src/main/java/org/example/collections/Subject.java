package org.example.collections;

import java.util.List;

public class Subject {
    private String subjectname;
    private int marks ;

//    @Override
//    public String toString() {
//        return "Subjects{" +
//                "name='" + subjectname + '\'' +
//                ", marks=" + marks +
//                '}';
//    }


    public Subject(String subjectname, int marks) {
        this.subjectname = subjectname;
        this.marks = marks;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public boolean passed(int passMarks){
        return marks>=passMarks;
    }
}
