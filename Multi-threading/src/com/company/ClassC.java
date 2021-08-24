package com.company;

public class ClassC extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("This is From Thread Class C with Odd Number = "+(2*i-1));
        }
        System.out.println("Here Thread Exiting From Class C");
    }
}
