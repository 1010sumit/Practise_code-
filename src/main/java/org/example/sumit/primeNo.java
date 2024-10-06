package org.example.sumit;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.println("not prime");
            return;
        }
        if(n==2){
            System.out.println("isprime");
            return;
        }
        boolean isprime = true;
        for(int i =3; i*i<=n; i++){
            if(n % i ==0){
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("is prime");
        } else {
            System.out.println("not prime");
        }


    }
}
