package com.ok.java.datatypes;

public class WithoutMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int i = 1; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println(sum);

        int count = 0;
        for (int i = 1; i <= 500000000; i++) {
            if (i % 10 == 7) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Total Time Taken: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
