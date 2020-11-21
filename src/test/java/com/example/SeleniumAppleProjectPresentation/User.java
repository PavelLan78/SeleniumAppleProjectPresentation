package com.example.SeleniumAppleProjectPresentation;

public class User {
    private  String ID;
    private  String password;

    public User setID(String ID) {
        this.ID = ID;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return  this;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
}
