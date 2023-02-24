package com.program5.entity;

import com.program5.exceptions.InsufficientFundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        // Create a checking account with an initial balance of 500
        Account checking = new CheckingAccount(500);
        // Create a savings account with an initial balance of 1000
        Account savings = new SavingAccount(1000);

        while (true){
            System.out.println("Enter 1 to deposit funds");
            System.out.println("Enter 2 to withdraw funds");
            System.out.println("Enter 3 to transfer funds");
            System.out.println("Enter 4 to display account information");
            System.out.println("Enter 5 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the account type (checking/savings):");
                    String accountType = scanner.next();
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    if (accountType.equals("checking")) {
                        checking.deposit(depositAmount);
                        System.out.println("Deposit successful. Current balance: " + checking.getBalance());
                    } else if (accountType.equals("savings")) {
                        savings.deposit(depositAmount);
                        System.out.println("Deposit successful. Current balance: " + savings.getBalance());
                    } else {
                        System.out.println("Invalid account type");
                    }
                    break;
                case 2:
                    System.out.println("Enter the account type (checking/savings):");
                    accountType = scanner.next();
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawalAmount = scanner.nextDouble();
                    if (accountType.equals("checking")) {
                        checking.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. Current balance: " + checking.getBalance());
                    } else if (accountType.equals("savings")) {
                        savings.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. Current balance: " + savings.getBalance());
                    } else {
                        System.out.println("Invalid account type");
                    }
                    break;
                case 3:
                    System.out.println("Enter the account to transfer from (checking/savings):");
                    String fromAccountType = scanner.next();
                    System.out.println("Enter the account to transfer to (checking/savings):");
                    String toAccountType = scanner.next();
                    System.out.println("Enter the amount to transfer:");
                    double transferAmount = scanner.nextDouble();
                    if (fromAccountType.equals("checking") && toAccountType.equals("savings")) {
                        checking.transfer(savings, transferAmount);
                        System.out.println("Transfer successful. Checking balance: " + checking.getBalance() + " Savings balance: " + savings.getBalance());
                    } else if (fromAccountType.equals("savings") && toAccountType.equals("checking")) {
                        savings.transfer(checking, transferAmount);
                        System.out.println("Transfer successful. Checking balance: " + checking.getBalance() + " Savings balance: " + savings.getBalance());
                    } else {
                        System.out.println("Invalid account types");
                    }
                    break;
                case 4:
                    System.out.println("Checking account information:");
                    System.out.println("Account number: " + checking.getAccountNumber());
                    System.out.println("Account type: " + checking.getAccountType());
                    System.out.println("Balance: " + checking.getBalance());
                    System.out.println("Transaction history:");
                    for (Transaction transaction : checking.getTransactionHistory()) {
                        System.out.println(transaction.getTransactionType() + " " + transaction.getAmount());
                    }
        }

    }
}}
