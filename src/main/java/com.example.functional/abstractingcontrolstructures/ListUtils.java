package com.example.functional.abstractingcontrolstructures;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T> T head(List<T> list) {
        return list.get(0);
    }

    public static <T> List<T> tail(List<T> list) {
        List<T> newList = new ArrayList<>(list);
        newList.remove(0);
        return newList;
    }

    public static <T> List<T> concat(List<T> list1, List<T> list2) {
        List<T> newList = new ArrayList<T>(list1);
        newList.addAll(list2);

        return newList;
    }

}
