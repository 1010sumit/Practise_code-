package org.example.thread;

public class world extends Thread {

    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println("world");
        }
    }
}
