package com.example.practice.design.pattern.proxypattern;

public class RealTimeServiceImpl implements RealTimeService {


    @Override
    public String getTransactionStatus(String transactionId) {
        return "Status: SUCCESS";
    }
}
