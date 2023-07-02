package com.example.functional.techniquesjavafunctional;

import com.example.functional.thinkingfunctionally.after.Order;
import com.example.functional.thinkingfunctionally.after.OrderStatus;

import java.util.function.Function;

public class RewardPointsCombiner3 {

    public static void main(String[] args) {
        Order order = new Order(OrderStatus.REWARDS_ISSUED, 12);
        Function<Order, RewardPoints> totalBasedRewardPoints = RewardPointsCombiner3::calculateRewardPoints;
        Function<RewardPoints, RewardPoints> roundRewardPoints = RewardPointsCombiner3::roundRewardPoints;
        Function<Order, RewardPoints> orderRewardPointsFunction = totalBasedRewardPoints.andThen(roundRewardPoints);
        System.out.println(orderRewardPointsFunction.apply(order));

    }


    private static RewardPoints roundRewardPoints(RewardPoints rewardPoints) {
        return new RewardPoints((int) (Math.round(rewardPoints.points/10.0) * 10));
    }

    private static RewardPoints calculateRewardPoints(Order order) {
        return new RewardPoints(19);
    }

}
