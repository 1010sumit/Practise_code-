package org.example.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(23);
        ll.insertFirst(1);
        ll.insertFirst(76);
        ll.insertFirst(16);
        ll.insertLast(45);
        ll.display();
        ll.insertAt(33,2);
        ll.display();
        ll.delete();
        ll.display();
        ll.deleteLast();
        ll.display();
        ll.deleteAt(2);
        ll.display();
        ll.find(99);
        ll.display();






    }
}
