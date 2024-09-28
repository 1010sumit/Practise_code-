package org.example.sumit;

import java.util.*;


public class StaticBlock {
//    static int a=7;
//    static int b;
//
//    static {
//        System.out.println("i am in static block!!");
//        b = a*6;
//
//    }
//
//    public static void main(String[] args) {
//        StaticBlock s= new StaticBlock();
//        System.out.println(StaticBlock.a);
//        System.out.println(StaticBlock.b);
//    }
public static void main(String[] args) {
    String name = "sumit";
    StringBuilder sb = new StringBuilder(name);
    sb.append(" prajapati");
    System.out.println(sb);
     String rev = String.valueOf(sb.reverse());
    System.out.println(sb);
    sb.delete(0,1);
    System.out.println(sb);
    sb.indexOf(name);
    sb.insert(0,"i");
    System.out.println(sb);
    sb.charAt(4);
    String name1 = sb.reverse().toString();
    System.out.println(name1);
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.trimToSize();
    System.out.println(sb);
    String newstring = sb.substring(0,5);
    System.out.println(newstring);
    char ch = sb.charAt(4);
    System.out.println(ch);
    int newname = sb.lastIndexOf("sumit");
    System.out.println(newname);
    int newname2 = sb.indexOf("sumit");
    System.out.println(newname2);
}



}
