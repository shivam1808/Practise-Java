package com.example.practice.design.pattern.proxypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CachedService implements RealTimeService {

    @Autowired
    private RealTimeService realTimeService;

    private Map<String, CachedTransactionStatus> cache = new HashMap<>();

    public CachedService(RealTimeService realTimeService) {
        this.realTimeService = realTimeService;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        CachedTransactionStatus cachedStatus = cache.get(transactionId);

        if (cachedStatus != null && !isExpired(cachedStatus)) {
            return cachedStatus.Status;
        }
        String status = realTimeService.getTransactionStatus(transactionId);

        cache.put(transactionId, new CachedTransactionStatus(status, System.currentTimeMillis()));

        return status;
    }

    private boolean isExpired(CachedTransactionStatus cachedStatus) {
        long expiryTime = 5 * 60 * 1000;
        return System.currentTimeMillis() - cachedStatus.getTimestamp() > expiryTime;
    }
}
