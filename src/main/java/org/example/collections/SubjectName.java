package org.example.collections;

public class SubjectName {
    private int telugu;
    private int english;
    private int hindi;
    private int science;

    public SubjectName(int telugu, int english, int hindi, int science) {
        this.telugu = telugu;
        this.english = english;
        this.hindi = hindi;
        this.science= science;
    }

    public int getTelugu() {
        return telugu;
    }

    public int getEnglish() {
        return english;
    }

    public int getHindi() {
        return hindi;
    }

    public int getScience() {
        return science;
    }
}
