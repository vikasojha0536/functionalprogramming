package com.example.functional.generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendVsSuper {

    public static void main(String[] args) {
        char[] chars = new char[4];
        new String(chars, 0,2 );
        List<? super Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.3);
        System.out.println(list.get(1));


    }
}
