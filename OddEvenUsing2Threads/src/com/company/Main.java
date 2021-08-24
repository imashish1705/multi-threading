package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrintOddEvenNegative print = new PrintOddEvenNegative(1,20);
        Thread even = new Thread(new EvenThread(print));
        even.setName("Even thread");
        Thread odd = new Thread(new OddThread(print));
        odd.setName("Odd thread");
//     Thread negative = new Thread(new NegativeThread(print));
//     negative.setName("Negative thread");
        even.start();
        odd.start();
       // negative.start();
    }
}
