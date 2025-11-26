package com.ok.java.datatypes;

// encapsulation example with access modifiers
// encapsulation is the wrapping up of data under a single unit so that only the data can be accessed
// constructor is used to initialize the object of class
public class Car {
    private int speed;
    // private access modifier changed to default to allow access in TestExample
    private String color;

    // default constructor to initialize color 
    public Car(String color) {
        this.color = color;
    }
    // setter method to set speed of car and print the speed
    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed cannot be negative");
        }
        this.speed = speed;
        System.out.println("The speed of the car is: " + this.speed);
    }
}
