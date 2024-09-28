package org.example.sumit;

import java.util.Arrays;
import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        int[] arr = {1,23,23,45,54,1};
         int[] result = duplicate(arr);
        for (int i=0;i<result.length-1; i++){
            System.out.println(result[i]);

        }



    }
    public static int[] duplicate(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : set){
            set.add(n);
        }
        int[] result = new int[set.size()];
        int i=0;
        for(int n : set){
            result[i++] = n;
        }
        return result;
    }

}