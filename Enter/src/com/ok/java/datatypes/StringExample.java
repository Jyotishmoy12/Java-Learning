package com.ok.java.datatypes;

public class StringExample {
    public static void main(String[] args) {
        int a = 1; // stack memory and heap memory
        String str1 = "Hello"; // String pool in heap memory in str1 variable it stores reference of "Hello"
        String str2 = "Hello";
        System.out.println(str1 == str2); // true because both str1 and str2 are pointing to same "Hello" in String pool
        String str3 = new String("Hello"); // new keyword creates new object in heap memory
        System.out.println(str1 == str3); // false because str3 is pointing to different object in heap memory
        System.out.println(str1.equals(str3)); // true because equals method compares the content of the strings
        // String is immutable
        String name = "John";
        name.toUpperCase(); // this will not change the original string
        System.out.println(name); // John

        // but to make it change we need to reassign it
        name = name.toUpperCase();
        System.out.println(name); // JOHN
    }
}
