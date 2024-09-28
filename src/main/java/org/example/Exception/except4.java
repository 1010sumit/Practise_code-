package org.example.Exception;

public class except4 {
    public static void main(String[] args) {
        try{
            int n =32/0;
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);

        }catch(ArithmeticException e){
            throw new ArithmeticException("use Arithmetic ");

        }
        finally {
            System.out.println("i will run !");
        }
        System.out.println("hello!");
    }
}
