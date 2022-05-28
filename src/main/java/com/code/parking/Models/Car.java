package com.code.parking.Models;

public class Car {
    private String regNumber;
    private String userAge;

    public Car(String regNumber, String userAge) {
        this.regNumber = regNumber;
        this.userAge = userAge;
    }

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
