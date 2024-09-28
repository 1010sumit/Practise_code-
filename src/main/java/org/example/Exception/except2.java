package org.example.Exception;

import jdk.jshell.spi.ExecutionControlProvider;

import java.io.IOException;

public class except2 {
    public static void main(String[] args) {
        try{
            lv1();
        }catch(IOException e) {
            System.out.println(e);
        }
    }
    public static void lv3() throws IOException {
        throw new IOException("got device");

    }
    public static void lv2() throws IOException {

        lv3();
    }
    public static void lv1() throws IOException {

        lv2();
    }

}
