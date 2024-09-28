package org.example.sumit;

public class lower_upper {
    public static void uppertolower(String name1) {
        // converting lower to upper case letter
        int[] ascii = new int[name1.length()];
        for (int i = 0; i < name1.length(); i++) {
            ascii[i] = (int) name1.charAt(i);
            int newval = ascii[i] + 32;
            char ch = (char) newval;
            System.out.print(ch + "");
        }
    }

    public static void lowertoupper(String name){
        // converting lower to upper case letter
        int[] ascii = new int[name.length()];
        for(int i =0; i<name.length(); i++){
            ascii[i] = (int)name.charAt(i);
            int newval = ascii[i]-32;
            char ch = (char) newval;
            System.out.print(ch + "");
        }
    }
    public static void main(String[] args) {
        String name = "sumit";
        String name1 = "SANDEEP";
//        char[] ch_name = name.toCharArray();
//        char[] ch_name1 = name1.toCharArray();


       lowertoupper(name);
        System.out.println();
       uppertolower(name1);



    }
}
