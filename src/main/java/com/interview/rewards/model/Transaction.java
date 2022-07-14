package com.interview.rewards.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Transaction {

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Transaction(Date saleDate, Double amount) {
        this.saleDate = saleDate;
        this.amount = amount;
    }

    public Transaction() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    private Date saleDate;
    private Double amount;
}
