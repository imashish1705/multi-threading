package com.company;

public class classB implements  Runnable{

        public void run( ) {
            for(int i = 1; i <= 10; i++) {
                System.out.println("Thread B with B = "+ 2*i);
            }
            System.out.println("Exiting Thread B ...");
        }


}
