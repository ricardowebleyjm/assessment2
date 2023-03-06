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


    /**
     * Adds a new transaction to this account's transaction history.
     * @param transactionType the type of transaction (e.g., "Withdrawal", "Deposit", "Transfer")
     * @param amount the amount of the transaction
     * @param fromAccount the account from which the transaction was initiated
     */
    public void addTransaction(String transactionType, double amount, String fromAccount) {
        Transaction transaction = new Transaction(transactionType, amount, fromAccount);
        transactionHistory.add(transaction);
    }
    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    /**
     * Transfers a specified amount from an account to another account.
     * @param account the account to transfer funds to
     * @param amount the amount to transfer
     * @throws InsufficientFundsException if this account has insufficient funds to complete the transfer
     */
    public void transfer(Account account, double amount) throws InsufficientFundsException {
        withdraw(amount);
        account.deposit(amount);
        addTransaction("Transfer", amount, account.getAccountType());
    }

    /**
     * Deposits a specified amount into an account.
     *
     * @param amount the amount to deposit
     */
    public abstract void deposit(double amount);

    /**
     * Withdraws a specified amount from an account.
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException if this account has insufficient funds to complete the withdrawal
     */
    public abstract void withdraw(double amount) throws InsufficientFundsException;
}
