package org.example.polymorphism;

public class overloading {
    private float i;
    private float k;

    private int j;

     int add(int i , int j){
        return i+j;
    }
    public int add (int i, int j ,int k){
        return i+j+k;
    }
    public float add(float i,float j){
        return i+j;
    }

//    public overloading(int i ,int j,int k) {
//        this.i= i;
//        this.j=j;
//        this.k=k;
//
//    }
//    public overloading(int i ,int j) {
//        this.i= i;
//        this.j=j;
//
//    }
//    public overloading(float i ,float j) {
//        this.i= i;
//        this.j= (int) j;
//
//
//    }

    public static void main(String[] args) {
        overloading o = new overloading();
        System.out.println(o.add(2,3,4));
        System.out.println(o.add(23.5f,34.6f));
        System.out.println(o.add(23.5f,34));
    }
}
