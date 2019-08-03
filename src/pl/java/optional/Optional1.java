package pl.java.optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("value");
        Optional<String> b = Optional.empty();
        System.out.println("Istnieje a: " + a.isPresent());
        System.out.println("a = " + a.get());
        System.out.println("Istnieje b: " + b.isPresent());
        System.out.println("b = " + b.orElse("empty"));
    }
}
