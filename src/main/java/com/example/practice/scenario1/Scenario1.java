package com.example.practice.scenario1;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Scenario1 {

    public static void main(String[] args) {

        Product product1 = new Product("100", "Iphone 13", "Mobile", 1, true, 90000.0);
        Product product2 = new Product("101", "Samsung S25", "Mobile", 2, true, 150000.0);
        Product product3 = new Product("102", "Mouse", "Electronic", 1, true, 90.0);
        Product product4 = new Product("103", "Laptop", "Electronic", 1, true, 290000.0);
        Product product5 = new Product("104", "Perfume", "Cosmetic", 1, true, 2500.0);
        Product product6 = new Product("104", "Soap", "Cosmetic", 3, false, 1500.0);

        Order order1 = Order.builder()
                .orderId("ORD1")
                .products(Arrays.asList(product1, product2, product3, product4, product5, product6))
                .totalValue(8000.0)
                .orderTime(LocalDateTime.now().minusHours(3))
                .build();

        Order order2 = Order.builder()
                .orderId("ORD1")
                .products(Arrays.asList(product1, product2, product3, product4, product5, product6))
                .totalValue(12000.0)
                .orderTime(LocalDateTime.now().minusHours(5))
                .build();

        List<Order> orders = Arrays.asList(order1, order2);

        Map<String, Integer> productList = orders.stream()
                .filter(order -> order.getTotalValue() > 500 && order.getOrderTime().isAfter(LocalDateTime.now().minusHours(24)))
                .flatMap(order -> order.getProducts().stream())
                .filter(Product::isInStock)
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getQuantity)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(productList);


    }
}
