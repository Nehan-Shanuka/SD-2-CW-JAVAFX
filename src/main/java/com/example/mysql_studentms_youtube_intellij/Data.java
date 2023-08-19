package com.example.mysql_studentms_youtube_intellij;

public class Data {

    private static final Data instance = new Data();

    private String firstName, secondName, email;

    public Data(){}

    public static Data getInstance(){
        return instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
