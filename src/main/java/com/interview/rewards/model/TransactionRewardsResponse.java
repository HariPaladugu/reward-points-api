package com.interview.rewards.model;


import java.util.List;

public class TransactionRewardsResponse {
	
	private List<CustomerRewardResponse> customerRewardResponse;

	public List<CustomerRewardResponse> getCustomerRewardResponse() {
		return customerRewardResponse;
	}

	public TransactionRewardsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionRewardsResponse(List<CustomerRewardResponse> customerRewardResponse) {
		super();
		this.customerRewardResponse = customerRewardResponse;
	}

	public void setCustomerRewardResponse(List<CustomerRewardResponse> customerRewardResponse) {
		this.customerRewardResponse = customerRewardResponse;
	}

}
