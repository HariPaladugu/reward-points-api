package com.interview.rewards.model;

import java.util.List;

public class CustomerTransactions {
    private String customerId;
    private List<Transaction> transactions;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public CustomerTransactions() {
    }

    public CustomerTransactions(String customerId, List<Transaction> transactions) {
        this.customerId = customerId;
        this.transactions = transactions;
    }
}
