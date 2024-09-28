package org.example.Exception;

public class InsufficientBalanceException extends Exception {
    private double amount;



    public double getAmount() {
        return amount;
    }

    public InsufficientBalanceException(double amount) {
        super("low money! ");
        this.amount = amount;
    }
}
