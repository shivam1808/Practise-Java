package com.example.practice.design.pattern.factorypattern;

import org.springframework.util.StringUtils;

public class PaymentFactory {

    public static PaymentService getPaymentService (String paymentType) {
        if (StringUtils.isEmpty(paymentType)) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("CREDITCARD")) {
            return new CreditCardPayment();
        } else if (paymentType.equalsIgnoreCase("PAYPAL")) {
            return new PayPalPayment();
        } else if (paymentType.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        }
        return null;
    }
}
