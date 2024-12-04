package org.example.collections.comparableAndComparator;

public class StudentUsingComparable extends Comparable<StudentUsingComparable> {
    private String sName;
    private int cls;
    private int age;

    public String getsName() {
        return sName;
    }

    public int getCls() {
        return cls;
    }

    public int getAge() {
        return age;
    }

    public StudentUsingComparable(String sName, int cls, int age) {
        this.sName = sName;
        this.cls = cls;
        this.age = age;
    }


    @Override
    public String toString() {
        return "StudentUsingComparable{" +
                "sName='" + sName + '\'' +
                ", cls=" + cls +
                ", age=" + age +
                '}';
    }

    public int compareTo(StudentUsingComparable that) {
        if (this.cls>that.cls){
            if (this.age>that.age){
                return 1;
            }
            else{
                return -1;
             }



        }
        else{
            return -1;
        }
    }
}
