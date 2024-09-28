package org.example.sumit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class acii_code {
    public static void main(String[] args) {
        String name = "sumit";
        System.out.println("actual name was " +name +" ");

        int[] ascivalue = new int[name.length()];
        for( int i =0; i<name.length(); i++){
            ascivalue[i] =(int) name.charAt(i);
        }
        Arrays.sort(ascivalue);

        System.out.println("asci value according to ascending order :");
        for( int value: ascivalue){
            System.out.print(value + " ");
        }
        System.out.println("\nthe element are:");
        for (int value : ascivalue){
            System.out.print( (char) value + " ");

        }
    }

}
