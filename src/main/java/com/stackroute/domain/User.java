package com.stackroute.domain;



public class User {

    private String gender;

    private String userName;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    User(){

    }
    //Constructor for getting user name

    public User(String userName,String gender){
        this.userName = userName;
        this.gender = gender;
    }

    // get user Value
    public String getUserName() {
        return userName;
    }
}
