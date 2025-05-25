package com.example.practice.scenario1;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class Order {

    private String orderId;

    private List<Product> products;

    private double totalValue;

    private LocalDateTime orderTime;
}
