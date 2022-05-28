package com.code.parking.Models;

public class Car {
    private String regNumber;   // Registration number of our Car object
    private String userAge;     // Age of user/drive of car

    public Car(String regNumber, String userAge) {    //constructor
        this.regNumber = regNumber;
        this.userAge = userAge;
    }


    //Getters and Setters

    public String getRegNumber() {
        return regNumber;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
