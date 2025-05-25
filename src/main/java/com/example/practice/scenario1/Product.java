package com.example.practice.scenario1;

import lombok.Data;

@Data
public class Product {

    private String productId;

    private String productName;

    private String category;

    private int quantity;

    private boolean inStock;

    private double price;

    public Product(String productId, String productName, String category, int quantity, boolean inStock, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.inStock = inStock;
        this.price = price;
    }
}
