package com.example.functional.thinkingfunctionally.after;

import com.example.functional.thinkingfunctionally.before.Order;

public class Customer {

    private Integer rewardBalance;


    // calling updateBalanceReward with same order twice will result in different output
    // this is against pure functions as functions only return same output with same input
    // so will move this to process reward class
    public void updateBalanceReward(Order order) {
       if(order.getOrderRewards() != null) {
            this.addToRewardBalance(order.getOrderRewards());
       }
    }

    public void addToRewardBalance(Integer rewardBalance) {
        this.rewardBalance += rewardBalance;
    }

    public Integer getRewardBalance() {
        return rewardBalance;
    }

    public void setRewardBalance(Integer rewardBalance) {
        this.rewardBalance = rewardBalance;
    }
}
