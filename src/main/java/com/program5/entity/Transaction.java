package com.program5.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
    private double amount;
    private String transactionType;
    private  String  fromAccount;
    private String timestamp;
    private double fee;

    public Transaction(){}

    /**
     * Transaction class takes a String transactionType, a double amount,
     * a String fromAccount, and a double fee as parameters and initializes the transaction
     * with the given information and the current timestamp.
     * @param transactionType a String representing the type of transaction.
     * @param amount representing the amount of money involved in the transaction.
     * @param fromAccount  fromAccount a String representing the account type(Saving, Checking etc.)
     * involved in the transaction
     * @param fee amount charged for the transaction.
     */
    public Transaction(String transactionType, double amount, String fromAccount, double fee) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.fee = fee;
    }

    /**
     * Transaction class takes a String transactionType, a double amount,
     * a String fromAccount, and a double fee as parameters and initializes the transaction
     * with the given information and the current timestamp.
     * @param transactionType a String representing the type of transaction.
     * @param amount representing the amount of money involved in the transaction.
     * @param fromAccount  fromAccount a String representing the account type(Saving, Checking etc.)
     * involved in the transaction
     */
    public Transaction(String transactionType, double amount, String fromAccount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    /*Accessor and Mutators */

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
