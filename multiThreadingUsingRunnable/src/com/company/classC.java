package com.company;

public class classC implements Runnable{
    public void run( ) {
        for(int k = 1; k <= 5; k++) {
            System.out.println("Thread C with C = "+ (2*k-1));
        }
        System.out.println("Exiting Thread C ...");
    }
}
