package org.example.Collection;

import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();

        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
//        int i =0;
//        Integer.hashCode(i);
        stack.pop();
       try{
           stack.get(4);
       }catch(Exception e){
           System.out.println(e);
       }
        for(String name : stack){
            System.out.println(name);
        }
        stack.removeIf(n-> n.contains("Garima"));

        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
