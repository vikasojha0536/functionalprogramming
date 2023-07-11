package com.example.functional.codingquestions.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMap {

    public static void main(String[] args) {
        String s = "s a b b v g g y";
        //List<String> collect = Arrays.stream(s.split(" ")).distinct().collect(Collectors.toList());
        List<String> collect = Arrays.stream(s.split(" ")).collect(
                                             Collectors.groupingBy(t -> t, Collectors.counting()))
                                     .entrySet().stream().filter(t -> t.getValue() == 1)
                                     .map(Map.Entry::getKey)
                                     .collect(Collectors.toList());
        System.out.println(collect);
    }

}
