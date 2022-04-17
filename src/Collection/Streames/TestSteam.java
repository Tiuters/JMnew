package Collection.Streames;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSteam {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("a", 23),
                new Person("b", 25),
                new Person("c", 45),
                new Person("d", 63),
                new Person("e", 65),
                new Person("f", 33));

          List<String> names = persons.stream().filter(x -> x.getAge() > 30).map(Person::getName).collect(Collectors.toList());

        System.out.println(names);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}