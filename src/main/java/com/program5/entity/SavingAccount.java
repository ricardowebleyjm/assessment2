package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

public class SavingAccount extends Account{
    private final double WITHDRAWAL_FEE = 5.0;

    public SavingAccount(double balance) {
        super("Saving", balance);
    }
    /**
     * @param amount
     */
    @Override
    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
    }

    /**
     * @param amount
     * @throws com.program5.exceptions.InsufficientFundsException
     */
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        double totalWithdrawAmount = amount + WITHDRAWAL_FEE;
        if (totalWithdrawAmount > getBalance()) {
            throw new InsufficientFundsException("Insufficient funds in savings account. Current balance: $" + getBalance());
        } else {
            double newBalance = getBalance() - totalWithdrawAmount;
            setBalance(newBalance);
        }
    }

}
