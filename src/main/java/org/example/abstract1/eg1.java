package org.example.abstract1;

public class eg1 {
    public static void main(String[] args) {
        SubClass s= new SubClass();
        s.funA();
    }
}
abstract class SuperAbstract {
    protected int a = 2;
    public void funA() {
        System.out.println("In SuperAbstract:" + this.a);
    }
}

class SubClass extends SuperAbstract {
    private int a = 34;
    //Overriding the above function
    public void funA() {
        System.out.println("In SubClass: " + a);
        //Or even check using the super keyword
        System.out.println("In SubClass with super: " + super.a);
        //Now call the function to display the value of a from SuperAbstract
        super.funA();
    }
}