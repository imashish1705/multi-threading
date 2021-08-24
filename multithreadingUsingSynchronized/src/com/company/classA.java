package com.company;

public class classA {
    synchronized void sum(int a) {
        Thread t = Thread.currentThread();
        for(int i = 1; i <= 5; i++) {
            System.out.println(t.getName()+":"+i*-1);
        }
    }
}
