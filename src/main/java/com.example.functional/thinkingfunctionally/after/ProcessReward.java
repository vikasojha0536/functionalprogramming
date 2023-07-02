package com.example.functional.thinkingfunctionally.after;

public class ProcessReward {

    public static Order issueRewards(Order order) {
        return new Order(OrderStatus.REWARDS_ISSUED, order.orderRewards);
    }

    // calling updateBalanceReward with same order twice will result in different output
    // this is against pure functions as functions only return same output with same input
    // so will move this to process reward class
    public Customer updateBalanceReward(Order order, Customer customer) {
        if(order.orderRewards != null) {
            return new Customer(customer.rewardBalance + order.orderRewards);
        }
        return customer;
    }
    // check the img.png for caller code
}
