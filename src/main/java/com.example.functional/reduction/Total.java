package com.example.functional.reduction;

import java.util.Arrays;
import java.util.List;

public class Total {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer reduce = numbers.stream()
                                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }

}
