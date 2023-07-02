package com.example.functional.reusablefunctions;

import java.util.function.Function;

public class CurryingFunctionExample {

    public static void main(String[] args) {
        CurriedFunction3 c =  s -> i -> l -> s + i + l;
        System.out.println(c.apply((short) 1).apply(1).apply(2L));

//        CurriedFunction3 c1 =  new CurriedFunction3() {
//            @Override
//            public Function<Integer, Function<Long, Long>> apply(Short aShort) {
//                return new Function<Integer, Function<Long, Long>>() {
//                    @Override
//                    public Function<Long, Long> apply(Integer integer) {
//                        return new Function<Long, Long>() {
//                            @Override
//                            public Long apply(Long aLong) {
//                                return null;
//                            }
//                        };
//                    }
//                };
//            }
//        };
    }

}
