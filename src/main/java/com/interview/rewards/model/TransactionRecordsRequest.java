package com.interview.rewards.model;

import java.util.List;

public class TransactionRecordsRequest {
    public TransactionRecordsRequest(List<CustomerTransactions> customerTransactionsList) {
        this.customerTransactionsList = customerTransactionsList;
    }

    public List<CustomerTransactions> getCustomerTransactionsList() {
        return customerTransactionsList;
    }

    @Override
	public String toString() {
		return "TransactionRecordsRequest [customerTransactionsList=" + customerTransactionsList + "]";
	}

	public TransactionRecordsRequest() {
    }

    public void setCustomerTransactionsList(List<CustomerTransactions> customerTransactionsList) {
        this.customerTransactionsList = customerTransactionsList;
    }

    private List<CustomerTransactions> customerTransactionsList;
}
