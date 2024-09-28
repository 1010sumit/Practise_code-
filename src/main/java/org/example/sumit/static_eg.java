package org.example.sumit;

import org.w3c.dom.ls.LSOutput;

public class static_eg {
//    int i= 5;
//    int j=9;
       int k =0;

   public static float divide(int i, int j){

        static_eg s = new static_eg();
       System.out.println("the variable calling in static method by create instance : " +s.k);
       return (float) i/j;
    }

    public static void main(String[] args) {
        System.out.println(divide(2,3));


    }

}
