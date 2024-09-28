package org.example.LinkedList;

public class DLL_main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFirst(22);
        dll.insertFirst(34);
        dll.insertFirst(45);
        dll.insertFirst(4);
        dll.display();
        System.out.println("reverse DoubleLinked List is :");
        dll.displayRev();
// so lets start with code here is the input so lets continue here so lets conntiue here
//        List<Integer> ll = new LinkedList<Integer>();
//        ll.add(22);
//        ll.add(34);
//        ll.add(45);
//        for (int val: ll){
//            System.out.print(val +" ->");
//        }
//        Collections.reverse(ll);
//        for (int val: ll){
//            System.out.print(val +" ->");
//        }

    }
}
