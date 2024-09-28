package org.example.sumit;

public class Occurence{
    public static void main(String[] args) {
        String name = "aakash";
        char[] charname = name.toCharArray();
        int occurence = 0;
        char target = 'k';
        for (int i =0; i< charname.length; i++){
            if(charname[i]==target){
                occurence++;
            }
        }
        System.out.println(occurence);
    }
}
