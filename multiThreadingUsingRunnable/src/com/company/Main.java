package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        classA a = new classA();
        classB b = new classB();
        //classC c = new classC();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        //Thread t3 = new Thread(c);
        Thread t3 = new Thread(new classC());
        t1.start();
        t2.start();
        t3.start();
    }
}
