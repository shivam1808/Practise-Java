package com.example.practice.design.pattern.proxypattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CachedTransactionStatus {

    String Status;

    long timestamp;
}
