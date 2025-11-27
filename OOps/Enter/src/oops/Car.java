package oops;

// encapsulation example 
// encapsulation is the wrapping up of data under a single unit.
// In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
public class Car {
    private String color;
    private String model;
    private String brand;
    private int year;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    // constructor
    // public Car() {
    // this.year = 2020;
    // }

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    // public int getYear() {
    // return year;
    // }
}
