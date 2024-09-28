package org.example.sumit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anargam {
    public static void main(String[] args) {
        String name1 = "act";
        String name2 = "tac";
        char[] char1 = name1.toCharArray();
        char[] char2 = name2.toCharArray();

            if (name1.length() == (name2.length())){
                Arrays.sort(char1);
                Arrays.sort(char2);
                if(Arrays.equals(char1,char2)){
                    System.out.println("anargam");
                }
                else
                    System.out.println("not anargam");
            }
            else {
                System.out.println("not anargam");
            }


    }
}
