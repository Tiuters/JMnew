package Collection.Streames.Misc;

import java.util.Arrays;
import java.util.stream.Stream;

public class Metodichka {
    public static void main(String[] args) {
        Stream
            .of("H e l l o", "w o r l d !")
            .flatMap((p) -> Arrays.stream(p.split(" ")))
            .toArray(String[]::new);                    //["H", "e", "l", "l", "o", "w", "o", "r", "l", "d", "!"]

        Stream.of("H e l l o", "W o r l d")
            .flatMap(h -> Arrays.stream(h.split(" ")))
            .map(d -> d.toUpperCase())
            .forEach(s -> System.out.print(s));
        System.out.println();


        Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");
        phoneStream.skip(1)
            .limit(2)
            .forEach(s->System.out.println(s));     // Lumia 950 Samsung Galaxy S 6



        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}
