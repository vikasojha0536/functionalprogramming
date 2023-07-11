package com.example.functional.abstractingcontrolstructures;

import java.util.ArrayList;
import java.util.List;

import static com.example.functional.abstractingcontrolstructures.ListUtils.head;
import static com.example.functional.abstractingcontrolstructures.ListUtils.tail;
import static com.example.functional.abstractingcontrolstructures.TailCall.suspend;

public class CalculateSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        int total =sum(list);
        System.out.println(total);
    }

    public static int sum(List<Integer> list) {
        TailCall<Integer> integerTailCall = sumTail(list, 0);
        return  integerTailCall.eval();
    }
    private static TailCall<Integer> sumTail(List<Integer> list, int acc) {
        return list.isEmpty()
                ? TailCall.done(acc)
                // here the recursive call(starting with size 5) is wrapped in supplier
                // it will not be called until the get of the supplier in the suspend is called
                // so once the get is called the next recursion with list size 4 starts
                //it will go until tailcall done is called in base condition
                : suspend(() -> sumTail(tail(list), acc + head(list)));
    }

}
