package com.example.practice.design.pattern.factorypattern;

public class CreditCardPayment implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing Credit Card Payment - $ " + amount);
    }
}
