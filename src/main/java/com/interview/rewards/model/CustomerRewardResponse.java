package com.interview.rewards.model;

import java.util.Map;

public class CustomerRewardResponse {
	
	private String customerId;
	
	private Long totalRewards;
	private Map<String, Long> monthlyRewards;
	public String getCustomerId() {
		return customerId;
	}
	public CustomerRewardResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public CustomerRewardResponse(String customerId, Long totalRewards, Map<String, Long> monthlyRewards) {
		super();
		this.customerId = customerId;
		this.totalRewards = totalRewards;
		this.monthlyRewards = monthlyRewards;
	}
	public Long getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(Long totalRewards) {
		this.totalRewards = totalRewards;
	}
	public Map<String, Long> getMonthlyRewards() {
		return monthlyRewards;
	}
	public void setMonthlyRewards(Map<String, Long> monthlyRewards) {
		this.monthlyRewards = monthlyRewards;
	}
	

}
