package com.company;

public class NegativeThread implements Runnable{
    PrintOddEvenNegative printEON;
    public NegativeThread(PrintOddEvenNegative printEON) {
        this.printEON = printEON;
    }
    @Override
    public void run() {
        printEON.printNegative();
    }
}
