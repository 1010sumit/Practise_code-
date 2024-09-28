package org.example.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class except3 {
    public static void main(String[] args) {
//        try{
//            M1();
//        }catch(Exception e){
//            System.out.println(e);
//
//        }
        M1();
        System.out.println("hello!");

    }
    public static void M1() {
        try {
            FileReader read = new FileReader("practise.java");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
