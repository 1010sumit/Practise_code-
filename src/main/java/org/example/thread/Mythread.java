package org.example.thread;

public class Mythread extends Thread {
    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread t = new Mythread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        t.sleep(2000);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
