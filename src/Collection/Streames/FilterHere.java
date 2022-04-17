package Collection.Streames;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterHere {
    public static void main(String[] args) {

        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");

        citiesStream.filter(c -> c.length() <7).forEach(s -> System.out.println(s));
    }
}
