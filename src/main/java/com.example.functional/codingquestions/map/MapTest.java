package com.example.functional.codingquestions.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : "aabbbbccccdfdftryryr".toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);

        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }

}
