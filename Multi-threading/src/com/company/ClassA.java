package com.company;

public class ClassA extends Thread{
    @Override
   public void run() {
        int a = -1;
        for(int i = 1; i <= 10; i++) {
            System.out.println("This is From Thread Class A with Negative number = "+a*i);
        }
        System.out.println("Here Thread Exiting From Class A");
    }
}
