package org.example.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;  // Initialize size to 0
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;  // If the list was empty, tail should now point to head
        }
        size++;
    }
    public void insertAt(int value, int index){
        if(index ==0){
            insertFirst(value);
            return;
        }
        if ( index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i =1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next= node;
        size++;
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }
    public void delete(){
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node secondLast = head;
        for(int i=1; i<size-2; i++){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        tail= null;
        size--;
    }
    public void deleteAt(int index){
        if(index ==0){
            delete();
            return;
        }
        if(index == size-1){
             deleteLast();
             return;
        }
        Node prev = head;
        for(int i =1; i<index-1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
