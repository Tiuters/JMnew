package Collection.Streames;

import java.util.stream.Stream;

class AnyMatchHere {
    public static void main(String[] args) {

        boolean b = Stream.of("a", "b", "c")
            .peek(System.out::print)
            .map(String::toUpperCase)
            .peek(System.out::print)
            .anyMatch("B"::equals);

        System.out.println("\n" + b);

        boolean c = Stream.of("a", "b", "c")
            .peek(System.out::print)
            .map(String::toUpperCase)
            .peek(System.out::print)
            .anyMatch(n -> n.equals("B"));
    }
}