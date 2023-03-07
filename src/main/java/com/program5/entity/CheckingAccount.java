package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

public class CheckingAccount extends Account{
   // private final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(double balance) {
        super("Checking", balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        addTransaction("Deposit", amount, getAccountType());
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        double totalWithdrawAmount = amount + getTransferFee();
        if (totalWithdrawAmount > getBalance()) {
            throw new InsufficientFundsException("Insufficient funds in checking account. Current balance: $" + getBalance());
        } else {
            double newBalance = getBalance() - totalWithdrawAmount;
            setBalance(newBalance);
            addTransaction("Withdraw", amount, getAccountType(),getTransferFee() );
        }
    }
}
