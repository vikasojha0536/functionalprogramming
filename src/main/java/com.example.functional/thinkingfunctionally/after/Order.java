package com.example.functional.thinkingfunctionally.after;


public class Order {

    public final OrderStatus orderStatus;

    public final Integer orderRewards;

    public Order(OrderStatus orderStatus, Integer orderRewards) {
        this.orderStatus = orderStatus;
        this.orderRewards = orderRewards;
    }

}
