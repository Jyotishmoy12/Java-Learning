package com.ok.java.datatypes;

// Example of Abstraction using Abstract Classes
// abstract class means some methods are declared without implementation and must be implemented by subclasses
// abstract classes cannot be instantiated directly
abstract class Animal {
    public abstract void sayHello();

    public abstract void sayBye();

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    public void sayHello() {
        System.out.println("Woof! Woof!");
    }

    public void sayBye() {
        System.out.println("Dog is leaving. Bye!");
    }
}

class Cat extends Animal {
    public void sayHello() {
        System.out.println("Meow! Meow!");
    }

    public void sayBye() {
        System.out.println("Cat is leaving. Bye!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal bob = new Dog();
        Animal bobby = new Cat();
        bob.sayBye();
        bobby.sayBye();
        bob.sleep();
        bobby.sleep();
    }
}
