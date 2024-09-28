package org.example.sumit;

public class superkeyword {
     static class Person{
        int id;
        String name;

        public Person(int id, String name){
            this.id = id ;
            this.name = name;

        }
    }
    static class employee extends Person{
         float salary;
         employee(int id ,String name , float salary){
             super(id,name);
             this.salary= salary;
             display();
//             Person p = new Person();
//             p.name= "sujal ";
         }
         void display(){
             System.out.println(id+ " "+name+ " "+salary);
         }
    }

    public static void main(String[] args) {

        employee e = new employee(12," sumit Prajapati", 200000);
        e.display();


    }
}
