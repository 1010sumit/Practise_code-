package org.example.Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        Collections.reverse(ll);
        System.out.println(ll);
        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
