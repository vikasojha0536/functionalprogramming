package com.example.functional.codingquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
        System.out.println(new HashSet<>(integerList));
    }

}
