package com.example.functional.codingquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatListOfStrings {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Welcome", "to", "TechGeekNext");
        String collect = str.stream().collect(Collectors.joining("-"));
        //String collect = String.join("-", str);
    }

}
