package org.example.abstract1;


interface  A {
    void a();
   void b();
    void c();
    void d();
    default void method(){
        System.out.println("default method in interface");
    }
    static void staticmethod(){
        System.out.println("static method in interface");
        privateMehtod();

    }
    private static void privateMehtod(){
        int a=10;
        int b =10;
        int sum = a+b;
        System.out.println(sum);
    }
}
abstract class B implements A{
    int i;
    public void a(){
        System.out.println("hello!");
    }
     B(){
         System.out.println("abstract class constructor");
    }
}
class C extends B{
    public void b(){
        System.out.println("kaise ho !");
    }
    public void c(){
        System.out.println("muje bulaya aap ne !");
    }
    public void d(){
        System.out.println("ruko aya mai");
    }
    public void method(){
        System.out.println("override method of interface which is defined in subclass");
    }
}
    public class Abstract_eg {
        public static void main(String[] args) {
            A a= new C();
            a.a();
            a.b();
            a.c();
            a.d();
            a.method();
            A.staticmethod();
        }



    }

