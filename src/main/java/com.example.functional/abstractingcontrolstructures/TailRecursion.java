package com.example.functional.abstractingcontrolstructures;

import java.util.Arrays;
import java.util.List;

import static com.example.functional.abstractingcontrolstructures.ListUtils.head;
import static com.example.functional.abstractingcontrolstructures.ListUtils.tail;

public class TailRecursion {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumTail(list, 0));

    }

    private static int sumRecursion(List<Integer> list) {

        if(list.isEmpty()) return 0;
        else return head(list) + sumRecursion(tail(list));
    }

    private static int sumRecursionWithVerbosity(List<Integer> list) {

        if(list.isEmpty()) return 0;
        else {
            int x = head(list);
            int y = sumRecursion(tail(list));
            return x + y;
        }
    }

    // With tail recursion accumulator is used
    // without tail recursion stack is used as accumulator
    private static int sumTail(List<Integer> list, int acc) {

        if(list.isEmpty()) return acc;
        else {
            return sumTail(tail(list), head(list) + acc);
        }
    }

}
