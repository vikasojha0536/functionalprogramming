package com.example.functional.reduction;

import java.util.Arrays;
import java.util.List;

public class StringConcat {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String reduce = letters.stream()
                               .reduce("", (partialString, nextElement) -> partialString + nextElement);
        String reduceAnother = letters.stream()
                               .reduce("", String::concat);

        System.out.println(reduce);
        System.out.println(reduceAnother);

    }

}
