package org.example.Generics;

public class class_exmaple {
    public static class operation<T>{
        protected T data;

        public operation(T data) {
            this.data = data;
        }
        public void getdata(){
            System.out.println(data);
        }
    }
    public static void main(String[] args) {
        operation<Integer> o = new operation<>(23);
        o.getdata();

        operation<String> o1 = new operation<>("Sumit Prajapati");
        o1.getdata();


    }
}
