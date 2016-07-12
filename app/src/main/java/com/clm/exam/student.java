package com.clm.exam;

/**
 * Created by jbt on 7/12/2016.
 */
public class student {

    private String name;
    private int grade;

    public student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
