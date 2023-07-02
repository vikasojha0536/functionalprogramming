package com.example.functional.reusablefunctions;

import java.util.function.Function;


//Type aliases
public interface CurriedFunction3 extends Function<Short, Function<Integer, Function<Long, Long>>>{}
