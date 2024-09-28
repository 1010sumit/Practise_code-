package org.example.Exception;

public class except5 {
    public static void main(String[] args) {

        try{
            System.out.println(divide(2,0));
        }catch(ArithmeticException e){
            System.out.println("no. is not divisible ");
        }
        System.out.println("end");

    }
    public static float divide(int i, int j) throws ArithmeticException{
        float divide = i/j;
        return divide;
    }
}
