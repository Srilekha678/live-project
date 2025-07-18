package com.mrtech.adminportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class courses {

    @Id
    private String courseid;

    private String coursename;
    private int duration;
    private int coursefee;


    // Getters and Setters
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getCoursefee() {
        return coursefee;
    }

    public void setCoursefee(int coursefee) {
        this.coursefee = coursefee;
    }
}
