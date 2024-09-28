package org.example.sumit;

public class ReverseString {
    public static void main(String[] args) {
        String name = "madan";
        char[] charArray = name.toCharArray();
        //reverse(charArray, 0, charArray.length-1);
        reverse(charArray);
        String reverseString = new String(charArray);
        if(reverseString.equals(name)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        System.out.println("before reverse: "+name);

        System.out.println("after reverse:" +reverseString);


    }
//    static void reverse( char[] charArray, int s , int e ){
//        while(s <= e){
//            int temp = charArray[s];
//            charArray[s]= charArray[e];
//            charArray[e]= (char) temp;
//            s++;
//            e--;
//        }

        static void reverse(char[] charArray){

            int m = charArray.length/2;
            for (int i =0; i<m; i++){
                int temp = charArray[i];
                charArray[i]= charArray[charArray.length-1-i];
                charArray[charArray.length-1-i] = (char) temp;
            }

    }

}
