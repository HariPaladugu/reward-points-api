package com.interview.rewards.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.interview.rewards.model.CustomerRewardResponse;
import com.interview.rewards.model.CustomerTransactions;
import com.interview.rewards.model.Transaction;
import com.interview.rewards.model.TransactionRecordsRequest;
import com.interview.rewards.model.TransactionRewardsResponse;

@Service
public class RewardPointsServiceImpl implements RewardPointsService {

	private static final int hundred = 100;
	private static final int fifty = 50;

	@Override
	public TransactionRewardsResponse calculateRewards(TransactionRecordsRequest transactionRecordsRequest) {

		TransactionRewardsResponse response = new TransactionRewardsResponse();
		List<CustomerRewardResponse> customerRewardResponseList = new ArrayList<CustomerRewardResponse>();

		for (CustomerTransactions customerTransaction : transactionRecordsRequest.getCustomerTransactionsList()) {

			CustomerRewardResponse customerRewardResponse = new CustomerRewardResponse();
			Map<String, Long> monthlyRewardsMap = new LinkedHashMap<String, Long>();
			customerRewardResponse.setCustomerId(customerTransaction.getCustomerId());
			for (Transaction transaction : customerTransaction.getTransactions()) {

				Long rewards = calculateRewards(transaction.getAmount());

				String month = new SimpleDateFormat("MMMM").format(transaction.getSaleDate());

				monthlyRewardsMap.put((month),
						null != monthlyRewardsMap.get(month) ? monthlyRewardsMap.get(month) + rewards : rewards);
			}
			customerRewardResponse.setMonthlyRewards(monthlyRewardsMap);
			customerRewardResponse.setTotalRewards(monthlyRewardsMap.values().stream().reduce(0L, Long::sum));
			customerRewardResponseList.add(customerRewardResponse);
		}

		response.setCustomerRewardResponse(customerRewardResponseList);
		return response;

	}

	private Long calculateRewards(Double amount) {

		int pointsOverfifty = 0;
		int pointsOverHundred = 0;

		if (amount > hundred) {
			pointsOverHundred = ((int) (amount - hundred)) * 2;
			pointsOverfifty = 50;
		} else {
			pointsOverfifty = (int) (amount - fifty);
		}
		return Long.valueOf(pointsOverHundred + pointsOverfifty);

	}

}
