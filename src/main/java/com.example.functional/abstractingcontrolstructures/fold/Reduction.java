package com.example.functional.abstractingcontrolstructures.fold;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Reduction {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c");
        StringBuilder identity = new StringBuilder();
        String reduce = letters.stream().reduce(identity, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(reduce);

        // Correct usage
        Supplier<StringBuilder> supplier = StringBuilder::new;
        String result = letters
                .stream()
                .collect(supplier, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println("Result: " + result);

        // They are not completely equivalent to foldLeft
    }

}
