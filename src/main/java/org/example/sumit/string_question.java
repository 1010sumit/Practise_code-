package org.example.sumit;

public class string_question {


        public static void main(String[] args) {
            String str = "abbdddccc";
            String exa = occ(str);
            System.out.println(exa);

        }
        public static String occ(String str){
            int count =1;
            StringBuilder s= new StringBuilder();
            for(int i=0; i<str.length(); i++){
                if( i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                    count++;
                }else{
                    s.append(str.charAt(i));
                    if(count>1){
                        s.append(count);
                    }
                    count =1;
                }
            }
            return s.toString();
        }
    }

