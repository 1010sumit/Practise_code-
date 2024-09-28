package org.example.Exception;

public class test {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(200);

        try {
            b.withdraw(150);
        } catch (Exception ex) {
            System.out.println(ex);
            }
        }
    }




