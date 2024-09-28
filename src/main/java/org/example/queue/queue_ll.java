package org.example.queue;

public class queue_ll {
    class node{
         private int val;
        node next;

        public node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    node front;
    node rear;

    public queue_ll() {
        this.front =null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return front==null && rear == null;
    }

    public void insert(int val){

       node newnode = new node(val);
       if(rear == null){
           front=rear=newnode;
       }else{
           rear.next = newnode;
           rear = newnode;
       }


    }
    public void pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        front= front.next;
        if(front==null){
            rear=null;
        }

    }
    public int getfront() throws Exception {
        if(!isEmpty()){
            return front.val;
        }else{
            throw new Exception("Queue is empty");
        }

    }
    public int getrear() throws Exception {
        if(!isEmpty()){
            return rear.val;
        }
        else{
            throw new Exception("queue is empty");
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        node temp = front;
        while(temp != null){

            System.out.print(temp.val + "<-");
            temp = temp.next;

        }
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        queue_ll q= new queue_ll();
        q.insert(34);
        q.insert(22);
        q.insert(33);
        q.display();
        System.out.println(q.getfront());
        q.pop();
        System.out.println(q.getfront());
        q.display();
        q.pop();
        q.pop();
        q.display();
        System.out.println(q.getrear());

    }


}
