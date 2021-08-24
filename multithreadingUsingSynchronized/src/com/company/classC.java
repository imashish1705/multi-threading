package com.company;

public class classC extends Thread{
public void run() {
    for(int i = 1; i <= 10; i++) {
        System.out.println(2*i-1);
    }
}

}
