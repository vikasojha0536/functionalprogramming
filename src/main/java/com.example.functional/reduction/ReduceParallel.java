package com.example.functional.reduction;

import java.util.Arrays;
import java.util.List;

public class ReduceParallel {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        Integer reduce = ages.parallelStream().reduce(0, (partialSum, nextElement) -> partialSum + nextElement, (partialSum, nextElement) -> partialSum + nextElement);
        System.out.println(reduce);

        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
        Integer reduceUser = users.parallelStream().reduce(0, (partialSumOfUsersAges, nextUser) -> partialSumOfUsersAges + nextUser.getAge(),
                                                           Integer::sum);

    }

}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
