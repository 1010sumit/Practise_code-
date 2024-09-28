package org.example.stack;

import org.example.abstract1.Default_interface;

import java.util.ArrayList;
import java.util.List;

public class dynamicStack extends Stack_eg {
    public dynamicStack() {
        super();
    }

    @Override
    public void push(int val) {
       if(top == a.length){
           int[] temp = new int[a.length *2];
           for(int i = 0; i<a.length; i++){
               temp[i] = a[i];
           }
           temp = a;
       }
        super.push(val);
    }

    public static void main(String[] args) {
        Stack_eg s = new dynamicStack();
        s.push(34);
        s.push(34);
        s.push(34);
        s.push(34);
        s.push(34);
        s.push(34);
        s.push(34);



    }

}
