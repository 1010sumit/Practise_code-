package org.example.thread;

public class second implements Runnable {
    @Override
    public void run() {
        System.out.println("Now the thread is running");

    }
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new second();
        Thread th = new Thread(r1,"My new thread");
        Thread th1 = new Thread(r1,"My new thread 2");
        th.start();

        String str = th.getName();
        System.out.println(str);
        th.getPriority();
        th.getState();
        th.join();
    }
}
