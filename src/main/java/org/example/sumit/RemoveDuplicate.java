package org.example.sumit;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeduplicate(int[] arr) {
        int index = 0; // Index to keep track of unique elements

        // Traverse the sorted array and pick unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1; // Return the number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 55, 66, 3, 2, 1, 3, 5, 7, 5};

        // Sort the array
        Arrays.sort(arr);

        // Remove duplicates from the sorted array
        int length = removeduplicate(arr);

        // Print the array with unique elements
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
