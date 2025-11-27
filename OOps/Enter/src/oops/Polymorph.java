package oops;

// Demonstrating Polymorphism
// A single interface, multiple forms 
// polymorphism allows methods to do different things based on the object it is acting upon
public class Polymorph {
    public static void main(String [] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound(); // Outputs: Dog barks
        cat.makeSound(); // Outputs: Cat meows
    }
}
