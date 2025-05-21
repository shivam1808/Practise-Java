package com.example.practice.exception;

public class BankTransactionException extends Exception{

    public BankTransactionException(String message) {
        super(message);
    }

    public BankTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

}
