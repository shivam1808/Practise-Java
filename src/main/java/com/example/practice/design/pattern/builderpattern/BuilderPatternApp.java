package com.example.practice.design.pattern.builderpattern;

import java.time.LocalDateTime;

public class BuilderPatternApp {

    public static void main(String[] args) {

        Order order = Order.builder()
                .setOrderId("123")
                .setOrderTime(LocalDateTime.now())
                .setTotalValue(2500.0)
                .build();

        System.out.println(order);

    }
}
