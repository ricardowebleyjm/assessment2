package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

public class CheckingAccount extends Account{

    /**
     * Constructor for the CheckingAccount class, takes a double balance as a parameter and calls
     * the constructor of the superclass (Account) with the account type set to "Checking" and the balance set to
     * the provided value.
     * @param balance
     */
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
