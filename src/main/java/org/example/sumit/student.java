package org.example.sumit;

import java.util.Scanner;

public class student {
     private int Id;
     //Scanner sc = new Scanner(System.in);

     String name ;
     static int count;

     public student(){
         this.name = name ;
         student.count +=1;
     }

     public void name(){
         System.out.println("My name is "+ name);
     }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    protected void show(){
        name();
        System.out.println(getId());
    }

    public static void main(String[] args) {
//        student s1 = new student("sumit");
//        student s2 = new student("sujal");
        System.out.println(student.count);
        System.out.println(student.count);
       // greet();
        fun();

    }
    static void fun(){
         student s= new student();
         s.greet();//because we know that we cannot call any method which is not static on nature
        // into static method for tht we need to create a objec tof it and thne we can call .

    }

    void greet(){
        System.out.println("hello!");
    }
}
