package org.example.Exception;

public class BankAccount {

    private double balance;


    BankAccount(double amount ){
        this.balance = amount;
    }

    public void withdraw(long amount) throws InsufficientBalanceException {
        if ( amount > balance){
            throw new InsufficientBalanceException(250);
        }
         balance -= amount;
        System.out.println("Withdraw successful: " +amount);
        System.out.println("Remaining :" +balance);
    }
}
