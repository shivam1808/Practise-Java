package com.example.practice.design.pattern.factorypattern;

public class PayPalPayment implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing PayPal Payment - $ " + amount);
    }
}
