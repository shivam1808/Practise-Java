package com.example.practice.design.pattern.builderpattern;

import java.time.LocalDateTime;

public class Order {

    private final String orderId;
    private final String product;
    private final double totalValue;
    private final LocalDateTime orderTime;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.product = builder.product;
        this.totalValue = builder.totalValue;
        this.orderTime = builder.orderTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String orderId;
        private String product;
        private double totalValue;
        private LocalDateTime orderTime;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setTotalValue(double totalValue) {
            this.totalValue = totalValue;
            return this;
        }

        public Builder setOrderTime(LocalDateTime orderTime) {
            this.orderTime = orderTime;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
