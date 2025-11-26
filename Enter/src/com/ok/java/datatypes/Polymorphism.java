package com.ok.java.datatypes;

// Example of Compile-time Polymorphism (Method Overloading)
// polymorphism allows methods to have the same name but different parameters
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Polymorphism{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
    }
}