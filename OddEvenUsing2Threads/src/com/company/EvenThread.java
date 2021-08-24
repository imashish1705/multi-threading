package com.company;

public class EvenThread implements Runnable{
    PrintOddEvenNegative printEON;

    public EvenThread(PrintOddEvenNegative printEON) {
        this.printEON = printEON;
    }
    @Override
    public void run() {
        printEON.printEven();
    }
}
