package org.example.queue;

public class main {
    public static void main(String[] args) throws Exception {
        int[] a;
        custom_queue c= new custom_queue();
        System.out.println(c.isEmpty());
        System.out.println( c.isFull());
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
        c.insert(5);
        c.display();
        System.out.println(c.pop());
        System.out.println( c.pop());
        c.display();
        System.out.println(c.first());
    }
}
