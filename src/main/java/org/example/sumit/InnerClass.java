package org.example.sumit;
//class A{
//    String name;
//
//    public A(String name ){
//        this.name = name;
//    }
//
//}
 public class InnerClass {
     static public class A{
        String name;

        public A(String name ){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        A a = new A("sumit");

        A b = new A("sujal");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
