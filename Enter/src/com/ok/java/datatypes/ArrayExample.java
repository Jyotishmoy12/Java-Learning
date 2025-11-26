package com.ok.java.datatypes;

public class ArrayExample {
    int[] numbers = new int[5];

    public static void main(String[] args) {
        // in Java, arrays are objects and are created in heap memory
        // to run the below code we need to create an instance of ArrayExample class
        // because numbers is not a static variable it is a instance variable
        ArrayExample example = new ArrayExample();
        for (int i = 0; i < example.numbers.length; i++) {
            System.out.println(example.numbers[i]);
        }
    }
}