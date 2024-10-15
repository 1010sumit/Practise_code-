package org.example.sumit;

public class Sum_without_plus {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;

        while(b != 0){
            int carry = (a&b) <<1;
            a = a^b;
            b = carry;
        }
        System.out.println("addition of two number using other approach ");
        System.out.println(a);
    }
}
