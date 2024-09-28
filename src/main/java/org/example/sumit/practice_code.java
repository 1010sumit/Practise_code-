package org.example.sumit;

public class practice_code {
//    abstract static class animal {
//        public abstract void speak();
//    }
//    static class lion extends animal {
//        public void speak(){
//            System.out.println("hoo!");
//        }
//    }
//    static class tiger extends animal{
//        public void speak(){
//            System.out.println("huaa!");
//        }
//    }
//
//    public static void main(String[] args) {
//        // Cannot instantiate an abstract class directly
//        // animal a = new animal(); // This would cause an error
//
//        // Instead, instantiate the subclasses
//        animal l = new lion(); // Polymorphism: using the abstract class reference
//        l.speak();
//
//        animal t = new tiger(); // Polymorphism: using the abstract class reference
//        t.speak();
//    }


   static abstract class Bird{
        public abstract void fly();
        public abstract void makeSound();

    }
    static class Eagle extends Bird{
       public void fly(){
           System.out.println("high!");
       }
       public void makeSound(){
           System.out.println("idk");
       }
    }
    static class Hawk extends Bird{
       public void fly(){
           System.out.println(" low!!");
       }
        public void makeSound(){
            System.out.println("idk");
        }
    }

    public static void main(String[] args) {
        Bird e = new Eagle();
        e.makeSound();
        e.fly();
        Bird h = new Hawk();
        h.fly();
        h.makeSound();

    }
}
