package com.company;

public class classA implements Runnable{
    public void run( ) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Thread A with A = "+ -1*i);
        }
        System.out.println("Exiting Thread A ...");
    }
}
