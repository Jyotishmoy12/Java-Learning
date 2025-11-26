package com.ok.java.datatypes;

public class Test {
    public static void main(String[] args) {
        int a = 5; // range of int is -2,147,483,648 to 2,147,483,647 (32-bit signed integer and
                   // uses 4 bytes of memory)
        byte b = 126; // range of byte is -128 to 127 (8-bit signed integer and uses 1 byte of memory)
        short c = 15; // range of short is -32,768 to 32,767 (16-bit signed integer and uses 2 bytes
                      // of memory)
        long d = 20; // range of long is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                     // (64-bit signed integer and uses 8 bytes of memory)
        double e = 5.5; // range of double is approximately ±5.0×10^−324 to ±1.7×10^308 (64-bit IEEE 754
                        // floating point and uses 8 bytes of memory)
        float f = 3.4f; // range of float is approximately ±1. (4×10^−45 to ±3.4×10^38 (32-bit IEEE 754
                        // floating point and uses 4 bytes of memory)
        boolean g = true; // boolean can be either true or false (uses 1 bit of memory, but size is JVM
                          // dependent)
        char h = 'A'; // range of char is 0 to 65,535 (16-bit Unicode character and uses 2 bytes of
                      // memory)

        System.out.println((int) h);

        System.out.println((char) 6787);

    }
}
