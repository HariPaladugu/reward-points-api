package com.interview.rewards.service;


import com.interview.rewards.model.TransactionRecordsRequest;
import com.interview.rewards.model.TransactionRewardsResponse;

public interface RewardPointsService {


 TransactionRewardsResponse calculateRewards(TransactionRecordsRequest transactionRecordsRequest);
 
}
