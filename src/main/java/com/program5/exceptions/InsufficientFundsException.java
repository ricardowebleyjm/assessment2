package com.program5.exceptions;

/**
 * Thrown when there are not enough funds in an account to complete a transaction
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}