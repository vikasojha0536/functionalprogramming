package com.example.functional.abstractingcontrolstructures.fold;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,77,30);
        int min =list.get(0), max = list.get(0);
        for(int a: list) {
            if(a <= min) {
                min =a;
            }
            if(a >= max) {
                max = a;
            }
        }
        System.out.println(min + " "+max);

//        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
//        Optional<Integer> min = list.stream().max(Comparator.reverseOrder());
//        System.out.println(max.get());
//        System.out.println(min.get());
    }

}
