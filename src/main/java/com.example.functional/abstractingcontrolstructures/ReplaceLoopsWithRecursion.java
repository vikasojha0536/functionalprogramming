package com.example.functional.abstractingcontrolstructures;

import java.util.Arrays;
import java.util.List;

/**
 * Replace loops with recursion to avoid mutations
 */
public class ReplaceLoopsWithRecursion {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int total = sumImperative(list);
        int total1 = sumRecursion(list);
        printWithRecursion(10);
        printWithRecursion(10);
        System.out.println(total);
        System.out.println(total1);
    }

    private static int sumImperative(List<Integer> list) {
        int total = 0;
        for(int item: list) {
            total = total + item;
        }
        return total;
    }

    private static int sumRecursion(List<Integer> list) {

        if(list.isEmpty()) return 0;
         else return ListUtils.head(list) + sumRecursion(ListUtils.tail(list));
    }

    private static void printWithRecursion(int n) {
        if(n > 0) {
            printWithRecursion(n -1);
            System.out.println(n);
        }
    }

}
