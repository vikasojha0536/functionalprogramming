package com.example.functional.techniquesjavafunctional;

import java.util.Collections;
import java.util.function.Function;

public class IdentityTest {
    public static void main(String[] args) {
        int n = 10;
        Function<Integer, Integer> g = x -> x; // Or Function.identity()
        Function<Integer, Integer> f = x -> x + 1;
        g = Collections.nCopies(n, f)
                                                       .stream()
                                                       .reduce(g, Function::compose);
        System.out.println(g.apply(0));

    }

}
