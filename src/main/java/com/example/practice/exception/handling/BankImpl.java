package com.example.practice.exception.handling;

import com.example.practice.exception.ApplicationException;
import com.example.practice.exception.BankTransactionException;

public class BankImpl implements Bank {

    @Override
    public int withdraw(int amount) throws ApplicationException {
        return 0;
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }
}
