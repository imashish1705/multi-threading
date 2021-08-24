package com.company;

public class UsingSubClass {

    public static void main(String[] args) {
    ClassA First_class = new ClassA();
    ClassB Second_class = new ClassB();
    ClassC Third_class = new ClassC();
        First_class.setPriority(Thread.MAX_PRIORITY);
        Second_class.setPriority(Second_class.getPriority() + 1);
        Third_class.setPriority(Thread.MIN_PRIORITY);
    First_class.start();
    Second_class.start();
    Third_class.start();
    System.out.println("...Multithreading is over here!");
    }
}
