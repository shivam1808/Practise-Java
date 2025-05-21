package com.example.practice.exception.handling;

import com.example.practice.exception.BankTransactionException;

public interface Bank {

    int withdraw(int amount);

    int deposit(int amount) throws BankTransactionException;
}
