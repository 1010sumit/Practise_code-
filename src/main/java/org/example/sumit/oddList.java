package org.example.sumit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isodd = true;
        int n =5;
        List<Integer> l = new ArrayList<Integer>();
        for(int i =0 ; i<n;i++){
            int ele = sc.nextInt();
            l.add(ele);
        }
        for(int num : l){
            if(num % 2 ==0){
                isodd = false;
                break;
            }
        }
        if (isodd) {
            System.out.println("All numbers are odd.");
        } else {
            System.out.println("There is at least one even number.");
        }

    }
}
