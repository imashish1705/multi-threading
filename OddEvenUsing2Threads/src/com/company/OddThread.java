package com.company;

public class OddThread implements Runnable{
    PrintOddEvenNegative printEON;
    public OddThread(PrintOddEvenNegative printEON) {
        this.printEON = printEON;
    }
    @Override
    public void run() {
        printEON.printOdd();
    }
}
