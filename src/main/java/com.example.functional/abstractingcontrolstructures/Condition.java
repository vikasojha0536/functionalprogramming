package com.example.functional.abstractingcontrolstructures;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Condition {

    public static <T> Statement<T> _if(Supplier<Boolean> condition, Supplier<T> action) {
        return new Statement<>(condition, action);
    }

    public static <T> Optional<Supplier<T>> match(Statement<T> ...statements) {
        return Stream.of(statements)
                .filter(s -> s.condition.get())
                .findFirst()
                .map(s -> s.action);
    }

    public static void main(String[] args) {
        Function<Product, Supplier<Double>> calculateDiscount = p -> Condition.match(
        Condition._if(() ->p.price < 10.0, () -> p.price * 0.1),
        Condition._if(() ->p.price >= 10.0, () -> p.price * 0.2)).orElse(() -> 0.0);
        System.out.println(calculateDiscount.apply(new Product(10.0)).get());
    }

}
