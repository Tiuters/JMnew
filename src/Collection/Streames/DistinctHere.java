package Collection.Streames;

import java.util.Objects;
import java.util.stream.Stream;

public class DistinctHere {
    private String string;
    public static void main(String[] args) {


        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistinctHere that = (DistinctHere) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
