package com.example.functional.codingquestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatListOfIntegers {

    public static void main(String[] args) {
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
        List<Integer> collect = Stream.of(OddNumbers, EvenNumbers).flatMap(l -> l.stream()).toList();
    }

}
