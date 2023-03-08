package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

public class SavingAccount extends Account{

    public SavingAccount(double balance) {
        super("Savings", balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        addTransaction("Deposit", amount, getAccountType());
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        double totalWithdrawAmount = amount + getWithdrawlFee();
        if (totalWithdrawAmount > getBalance()) {
            throw new InsufficientFundsException("Insufficient funds in savings account. Current balance: $" + getBalance());
        } else {
            double newBalance = getBalance() - totalWithdrawAmount;
            setBalance(newBalance);
            addTransaction("Withdraw", amount, getAccountType(), getWithdrawlFee());
        }
    }
    
}
