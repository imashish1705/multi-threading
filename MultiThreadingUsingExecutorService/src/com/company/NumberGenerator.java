package com.company;

public class NumberGenerator {
    private int number = 1;
    private int noOfThreads;
    private int TotalNoOfInSequence;

    public NumberGenerator(int noOfThreads, int totalNoOfInSequence) {
        super();
        this.noOfThreads = noOfThreads;
        TotalNoOfInSequence = totalNoOfInSequence;
    }
    public void printNumber(int result) {
        synchronized (this) {
            while(number < TotalNoOfInSequence-1) {
                while(number%noOfThreads != result) {
                  try {
                      wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                }
                System.out.println(Thread.currentThread().getName()+ "" +number++);
                notifyAll();
            }
        }
    }
}
