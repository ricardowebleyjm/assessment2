package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

import java.util.ArrayList;

public abstract  class Account {
    int accountNumber;
    private double balance;
    String accountType;
    private static int nextAccountNumber = 10001;
    private ArrayList<Transaction> transactionHistory;

    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;
}
