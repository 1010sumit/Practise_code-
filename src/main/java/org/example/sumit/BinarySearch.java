package org.example.sumit;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,65,66,87,98,111,89,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int value = search(arr, 0, arr.length);
        System.out.println("present at :" +value);

    }
    static int search(int[] arr , int s, int e) {

        int target = 99;
        int m = s + (e - s) / 2;

            if (s>=e) {
                return -1;
            }

                if (arr[m] == target) {
                    return m;

                }
                if (target > arr[m]) {
                    return search(arr, m + 1, arr.length);
                } else {
                    return search(arr, s, m - 1);
                }

    }
}
