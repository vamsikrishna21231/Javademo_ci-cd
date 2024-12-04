package org.example.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparable<S> {
    public static void main(String[] args) {
StudentUsingComparable usingComparable=new StudentUsingComparable("kishor",9,15);
        StudentUsingComparable usingComparable1=new StudentUsingComparable("vamsi",10,15);
        StudentUsingComparable usingComparable2=new StudentUsingComparable("kishan",9,13);
        StudentUsingComparable usingComparable3=new StudentUsingComparable("kiran",10,16);
        List<StudentUsingComparable> student1= new ArrayList<>();
        student1.add(usingComparable);
        student1.add(usingComparable1);
        student1.add(usingComparable2);
        student1.add(usingComparable3);
         for(StudentUsingComparable s:student1){
             System.out.println(s);
         }
    }
}