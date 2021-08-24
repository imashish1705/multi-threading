package com.company;

import javax.sound.midi.Soundbank;

public class classB extends Thread{
    classA a = new classA();
    public void run() {
     for(int i = 1; i <= 5; i++) {
         System.out.println(2*i);
     }
    }
}
