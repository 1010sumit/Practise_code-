package org.example.queue;

public class custom_queue {
    static final int DEFAULT_SIZE=10;
    int[] a;
    int end =0;

    public custom_queue() {
        this.a =new int[DEFAULT_SIZE];
        this.end = 0;
    }

    public boolean isFull(){
        return end ==a.length;
    }
    public boolean isEmpty(){
        return end ==0;
    }
    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        a[end++] = val;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int remove = a[0];
        for(int i =1; i<end; i++){
            a[i-1] = a[i];
        }
        end--;
        return remove;
    }
    public int first() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");

        }
        return a[0];

    }
    public void display(){
        for(int i =0; i<end; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}
