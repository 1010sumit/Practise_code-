package org.example.Generics;

public class method_example {
    public <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");

        }
    }

    public static void main(String[] args){
        Integer[] array = {1,2,34,4,5};
        String[] StringArray = {"sumit", "sujal ", "anand"};
        method_example m = new method_example();
        m.printArray(array);
        System.out.println();
        m.printArray(StringArray);
    }
}
