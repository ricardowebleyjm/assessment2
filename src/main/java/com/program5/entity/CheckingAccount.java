package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

public class CheckingAccount extends Account{
    private final double TRANSACTION_FEE = 0.5;

    public CheckingAccount(double balance) {
        super("Checking", balance);
    }

    /**
     * @param amount
     */
    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        System.out.println("$" + amount + " deposited into checking account. New checking balance: $" + getBalance());
    }

    /**
     * @param amount
     * @throws InsufficientFundsException
     */
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        double totalWithdrawAmount = amount + TRANSACTION_FEE;
        if (totalWithdrawAmount > getBalance()) {
            throw new InsufficientFundsException("Insufficient funds in checking account. Current balance: $" + getBalance());
        } else {
            double newBalance = getBalance() - totalWithdrawAmount;
            setBalance(newBalance);
        }
    }
}
