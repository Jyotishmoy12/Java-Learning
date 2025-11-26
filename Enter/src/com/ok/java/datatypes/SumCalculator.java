package com.ok.java.datatypes;

public class SumCalculator implements Runnable {
    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i <= 100000000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
