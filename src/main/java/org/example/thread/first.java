package org.example.thread;

public class first extends Thread{
    public static void main(String[] args) throws InterruptedException {

        world w = new world();
        w.start();
        for(int i=0; i<5; i++){
            Thread.sleep(5000);
                System.out.println(i);
            }
        }
    }


