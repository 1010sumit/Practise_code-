package org.example.LinkedList;

public class DoubleLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public DoubleLinkedList() {
            this.size = 0;
        }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev= null;
        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;  // If the list was empty, set tail to the new head
        }

        size++;
    }
    public void insertEnd(int val){
 
    }
    public void insertAt(int val, int index){

    }
    public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val);
                temp = temp.next;
                if(temp != null){
                    System.out.print(" -> ");
                }
            }
            System.out.println(" -> END");
        }
    public void displayRev() {
        if (tail == null) {  // Check if the list is empty
            System.out.println("The list is empty.");
            return;
        }

        Node temp = tail;  // Start from the tail
        while (temp != null) {
            System.out.print(temp.val);  // Print the current node's value

            temp = temp.prev;  // Move to the previous node

            if (temp != null) {  // If there is a previous node, print the arrow
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> END");
    }


    private class Node{
       private int val;
       private Node next;
       private Node prev;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next) {
           this.val = val;
           this.next = next;
       }

       public Node(int val, Node next, Node prev) {
           this.val = val;
           this.next = next;
           this.prev = prev;
       }
   }
}
