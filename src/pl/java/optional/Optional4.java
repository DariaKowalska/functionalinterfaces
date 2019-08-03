package pl.java.optional;

import java.util.Optional;

public class Optional4 {

    public static void main(String[] args) {
        Optional<String> value = Optional.of("value");
        value.ifPresent(System.out::println);
        value.map(String::toUpperCase).ifPresent(System.out::println);
    }

}
