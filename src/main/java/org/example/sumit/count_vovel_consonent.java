package org.example.sumit;

public class count_vovel_consonent {
    public static void main(String[] args) {
        String name = "Sumit";
        name = name.toLowerCase();
        int consonent =0;
        int vovel =0;
        for (int i=0 ; i< name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                vovel++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                consonent++;

            }
        }
        System.out.println("length of String is :" +name.length());
        System.out.println("vovel: "+vovel);
        System.out.println("consonent: " +consonent);
        System.out.println("the sum of vovel and consonent :" +(vovel+consonent));
        System.out.println(name);
    }
}

