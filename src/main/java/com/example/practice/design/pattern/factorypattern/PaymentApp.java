package com.example.practice.design.pattern.factorypattern;

public class PaymentApp {

    public static void main(String[] args) {
        String userPaymentChoice = "CREDITCARD";

        PaymentService paymentService = PaymentFactory.getPaymentService(userPaymentChoice);

        if (paymentService != null) {
            paymentService.processPayment(12500.0);
        } else {
            System.out.println("Invalid Payment Type");
        }

    }
}
