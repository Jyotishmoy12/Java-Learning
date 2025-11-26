package com.ok.java.datatypes;

// Interface declaration 
// interface is blueprint of a class which means it contains method declarations without body
// A class implements an interface, thereby inheriting the abstract methods of the interface.
// we cant create object of interface directly but we can create object of class which implements interface
interface Mobile {
    final int numberOfBatteries = 1;

    void makeCall();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Mobile {
    public void makeCall() {
        System.out.println("Making a call from SmartPhone");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall();
    }
}
