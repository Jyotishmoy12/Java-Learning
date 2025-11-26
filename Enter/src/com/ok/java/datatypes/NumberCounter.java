package com.ok.java.datatypes;

public class NumberCounter implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i <= 500000000; i++) {
            if (i % 10 == 7) {
                count++;
            }
        }
        System.out.println(count);
    }
}
