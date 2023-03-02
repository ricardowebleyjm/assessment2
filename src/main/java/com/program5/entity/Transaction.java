package com.program5.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
    private double amount;
    private String transactionType;
    private  String  fromAccount;
    private String timestamp;

    public Transaction(String transactionType, double amount, String fromAccount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

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
}
