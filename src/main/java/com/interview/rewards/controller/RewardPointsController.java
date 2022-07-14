package com.interview.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interview.rewards.model.TransactionRecordsRequest;
import com.interview.rewards.model.TransactionRewardsResponse;
import com.interview.rewards.service.RewardPointsService;

@RestController
public class RewardPointsController {

	@Autowired
	RewardPointsService rewardPointsService;

	@PostMapping(value = "/calculate-reward-points", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TransactionRewardsResponse generateTransactionRewardPoints(
			@RequestBody TransactionRecordsRequest transactionRecordsRequest) {
		TransactionRewardsResponse response = rewardPointsService.calculateRewards(transactionRecordsRequest);
		return response;

	}
}
