package com.example.ashvi.studyhelper;

public class User {

    public String name;
    public String id;
    public String major;
    public String hours;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name,String id, String major, String hours) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.hours = hours;
    }
}