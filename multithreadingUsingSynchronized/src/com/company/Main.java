package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        classB b = new classB();
        Thread t1 = new Thread( b);
        Thread t2 = new Thread( b);
        classC c = new classC();
        Thread t3 = new Thread(c);
        t1.setName("Thread A");
        t2.setName("Thread B");
        t2.setName("Thread C");
        t1.start();
        t2.start();
        t3.start();
    }
}
