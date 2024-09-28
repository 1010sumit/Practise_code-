package org.example.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr= {4,5,1,2,9};
        int[] result = selection(arr);
        System.out.println("sorted arr using selection:" + Arrays.toString(result));

    }
    public static int[] selection(int[] arr){
        for (int i =0 ; i <= arr.length-1; i++){
            int n = arr.length-i-1;
            int maxIndex = getmax(arr, n);
            swap(arr,maxIndex,n);
        }
        return arr;
    }
    static int getmax(int[] arr, int end ){
        int max = 0;

        for( int i =1; i<= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;

            }
        }
        return max;
    }
    static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
