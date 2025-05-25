package com.example.practice.design.pattern.factorypattern;

public class UPIPayment implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing UPI Payment - $ " + amount);
    }
}
