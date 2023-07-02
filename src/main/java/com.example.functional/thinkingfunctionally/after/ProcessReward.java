package com.example.functional.thinkingfunctionally.after;

public class ProcessReward {

    public static void issueRewards(Order order) {
        order.setOrderStatus(OrderStatus.REWARDS_ISSUED);
    }
}
