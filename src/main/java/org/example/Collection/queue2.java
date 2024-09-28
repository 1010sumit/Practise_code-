package org.example.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(34);
        q.add(23);
        q.add(2);
        q.add(3);
        q.add(55);
        q.add(99);

        Iterator<Integer> it = q.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("the peek element of queue is "+q.peek());
        System.out.println("this queue is "+q.isEmpty());
        System.out.println(" does this queue contians 2:"+q.contains(2));
        System.out.println(" the element is :"+q.element());




    }
}
