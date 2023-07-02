package com.example.functional.thinkingfunctionally.after;


public class Order {

    private OrderStatus orderStatus;

    private Integer orderRewards;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderRewards() {
        return orderRewards;
    }

    public void setOrderRewards(Integer orderRewards) {
        this.orderRewards = orderRewards;
    }
}
