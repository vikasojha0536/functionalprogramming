package com.example.functional.codingquestions;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinimumInStream {

    public static void main(String[] args) {
        Integer integer = Stream.of(1, 2, 3, 45, 6, 7)
                                .min(Comparator.comparing(Integer::valueOf))
                                .get();
        System.out.println(integer);
    }

}
