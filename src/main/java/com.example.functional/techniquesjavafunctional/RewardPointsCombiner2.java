package com.example.functional.techniquesjavafunctional;

import com.example.functional.thinkingfunctionally.after.Order;
import com.example.functional.thinkingfunctionally.after.OrderStatus;

import java.util.function.Function;

public class RewardPointsCombiner2 {

    public static void main(String[] args) {
        Order order = new Order(OrderStatus.REWARDS_ISSUED, 12);
        Function<Order, RewardPoints> totalBasedRewardPoints = RewardPointsCombiner2::calculateRewardPoints;
        Function<RewardPoints, RewardPoints> roundRewardPoints = RewardPointsCombiner2::roundRewardPoints;
        RewardPoints totalRewardPoints = roundRewardPoints.apply(totalBasedRewardPoints.apply(order));

        System.out.println(totalRewardPoints);

    }


    private static RewardPoints roundRewardPoints(RewardPoints rewardPoints) {
        return new RewardPoints((int) (Math.round(rewardPoints.points/10.0) * 10));
    }

    private static RewardPoints calculateRewardPoints(Order order) {
        return new RewardPoints(19);
    }

}
