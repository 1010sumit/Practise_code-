package org.example.sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {4,5,9,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(insertion(arr)));
    }
    static int[] insertion(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
            }

        }
        return arr;
    }
}
