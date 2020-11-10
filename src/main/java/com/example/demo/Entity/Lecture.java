package com.example.demo.Entity;

public class Lecture {

    private  int id;
    private int numberOfClasses;
    private String name;
    private String course;

    public Lecture(int id, int numberOfClasses, String name, String course) {

        this.id = id;
        this.numberOfClasses = numberOfClasses;
        this.name = name;
        this.course = course;
    }

    public Lecture() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
