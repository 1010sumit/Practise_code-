package org.example.abstract1;
interface  sumit{
    void a();


}
interface sandeep {
    void c();
    void d();
}
abstract class sudhir implements sumit,sandeep{
     public abstract void a();
    public abstract void c();
    abstract void b();



}
class rahul extends sudhir {
    public void a(){
        System.out.println("hello!");
    }
    public void b(){
        System.out.println("kaise ho !");
    }
    public void c(){
        System.out.println("muje bulaya aap ne !");
    }
    public void d(){
        System.out.println("ruko aya mai");
    }
}

public class interface_eg {
    public static void main(String[] args) {
        sudhir s= new rahul();
        s.a();
        s.b();
        s.c();
        s.d();
    }
}
