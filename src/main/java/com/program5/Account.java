package com.program5;

import java.util.ArrayList;

public  class Account implements IAtmActions {
    private long accountNumber;
    private String accountType;
    private double balance;
    private int pin;
    
    private static final ArrayList<Account> accounts = new ArrayList<>();
    
    public Account(int number, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public final static void initializeAccounts(){
        accounts.add(new Account(1000, 1000, 1000.0));
    }
    /**
     *
     */
    @Override
    public void deposit() {

    }

    /**
     *
     */
    @Override
    public void withdrawal() {

    }

    /**
     *
     */
    @Override
    public void transfer() {

    }
}
