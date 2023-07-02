package com.example.functional.codingquestions;

import java.util.Arrays;
import java.util.Collections;

public class SortPrimitivesInDesc {

    public static void main(String[] args) {
        int[] numArr = new int[]{1,2,3,4,5};
        int[] array = Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
                           .mapToInt(Integer::intValue).toArray();

    }

}
