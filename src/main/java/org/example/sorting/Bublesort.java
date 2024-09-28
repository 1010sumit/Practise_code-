package org.example.sorting;

import java.util.Arrays;

public class Bublesort {
    public static void main(String[] args) {
        int [] arr= {1,3,2,5,0,7,998,9};
        int[] result=bublesort(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] bublesort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        return arr;
    }

}
