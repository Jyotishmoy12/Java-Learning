package com.ok.java.datatypes;

// Example of Inheritance
// Inheritance allows a class to inherit properties and methods from another class
public class Inheritance {
    public static void main(String[] args) {
        MyCar car = new MyCar("Red");
        car.show(); // inherited method from Vehicle class
        car.displayColor(); // method from Car class
    }
}

class Vehicle {
    void show() {
        System.out.println("This is a vehicle.");
    }
}

class MyCar extends Vehicle {
    String color;

    MyCar(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Car color: " + color);
    }
}