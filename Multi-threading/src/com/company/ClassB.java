package com.company;

public class ClassB extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("This is From Thread Class B with Even number  : = "+(2*i));
        }
        System.out.println("Here Thread Exiting From Class B");
    }
}
