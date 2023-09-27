package com.lcwd.first.Model;

import org.springframework.stereotype.Component;

@Component
public class TodoManager {
    private int id;
    private String course;


    public TodoManager(int id,String course) {
        this.id = id;
        this.course = course;
    }

    public TodoManager() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "TodoManager{" +
                "id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}
