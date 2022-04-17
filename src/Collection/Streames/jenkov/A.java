package Collection.Streames.jenkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//********************************************** reduce ****************
public class A {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        Optional<String> reduced = stream.reduce((value, combinedValue) -> combinedValue + " + " + value);

        System.out.println(reduced.get());
    }
}
//********************************************** flatMap **************
class StreamExamples1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

//        Stream<String> stream = stringList.stream();
//
//        stream.flatMap((value) -> {
//                String[] split = value.split(" ");
//                return (Stream<String>) Arrays.asList(split).stream();
//            })
//            .forEach((value) -> System.out.println(value))
//        ;
        stringList
            .stream()
            .flatMap((value) -> {String[] spl = value.split(" ");
                        return Arrays.stream(spl);
            })
            .forEach(a -> System.out.println(a));
    }
}