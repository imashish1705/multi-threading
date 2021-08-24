package com.company;

public class PrintOddEvenNegative {
    int start, end;
    public PrintOddEvenNegative(int start, int end) {
        super();
        this.start = start;
        this.end = end;
    }
    public void printEven() {
        while(this.start <= this.end) {
            synchronized (this) {
                if(this.start%2 == 0) {
                    System.out.println(Thread.currentThread().getName()+" "+start);
                    start++;
                    this.notify();
                } else {
                    try {
                        this.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void printOdd() {
        while(this.start <= this.end) {
            synchronized (this) {
                if(this.start%2 != 0) {
                    System.out.println(Thread.currentThread().getName()+" "+start);
                    start++;
                    this.notify();
                } else {
                    try {
                        this.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public void printNegative() {
        while(this.start <= this.end) {
            synchronized (this) {
                if(this.start < 0 ) {
                    System.out.println(Thread.currentThread().getName()+" "+start);
                    start++;
                    this.notify();
                } else {
                    try {
                        this.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
