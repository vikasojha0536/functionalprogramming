package com.example.functional.abstractingcontrolstructures.fold;

import com.example.functional.abstractingcontrolstructures.TailCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static com.example.functional.abstractingcontrolstructures.ListUtils.*;
import static com.example.functional.abstractingcontrolstructures.TailCall.done;
import static com.example.functional.abstractingcontrolstructures.TailCall.suspend;

public class FoldExamplesRecursion {

    public static void main(String[] args) {
        List<Integer> order = Arrays.asList(1, 2, 3, 4);
        int total = sum(order, 0);
        System.out.println(total);

        total = length(order, 0);
        System.out.println(total);

        List<Integer> reversedList = reverse(order, new ArrayList<>());
        System.out.println(reversedList);

        Function<Integer, Function<Integer, Integer>> sum = x -> y -> x + y;
        total = generic(order, 0, sum);
        System.out.println(total);

        Function<List<Integer>, Function<Integer, List<Integer>>> reverse = x -> y -> concat(Arrays.asList(y), x);
        List<Integer> reversList = generic(order, new ArrayList<>(), reverse);
        System.out.println(reversList);
        TailCall<List<Integer>> listTailCall = genericWithTrampoline(order, new ArrayList<>(), reverse);
        System.out.println(listTailCall.eval());
    }
    static Integer sum(List<Integer> list, int acc) {
        return list.isEmpty()
                ? acc
                : sum(tail(list), head(list) + acc);
    }
    static Integer length(List<Integer> list, int acc) {
        return list.isEmpty() ? acc : length(tail(list), acc + 1);
    }

    static List<Integer> reverse(List<Integer> list, List<Integer> acc) {
        return list.isEmpty()
                ? acc
                : reverse(tail(list), concat(Arrays.asList(head(list)), acc));
    }
//    static Integer generic(List<Integer> list, int acc, Function<Integer, Function<Integer, Integer>> func) {
//        return list.isEmpty() ? acc : generic(tail(list), func.apply(head(list)).apply(acc), func);
//    }

    static <T, U> U generic(List<T> list, U identity, Function<U, Function<T, U>> func) {
        return list.isEmpty() ? identity : generic(tail(list), func.apply(identity).apply(head(list)), func);
    }

    static <T, U> TailCall<U> genericWithTrampoline(List<T> list, U identity, Function<U, Function<T, U>> func) {
        return list.isEmpty() ? done(identity) : suspend(() -> genericWithTrampoline(tail(list), func.apply(identity).apply(head(list)), func));
    }

}
