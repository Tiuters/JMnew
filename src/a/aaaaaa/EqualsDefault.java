package a.aaaaaa;

import java.util.Objects;

public class EqualsDefault {
}

interface Printable {
    default void print() {
        System.out.println("Undefined printable");
    }
}

interface Printable2 extends Printable {
    default void print() {
        System.out.println("Undefined ");
    }
}

interface Printable3   extends Printable{
    default void print() {
        System.out.println("printable");
    }
}

class Journal implements Printable2, Printable3 {
    private String name;

    String getName() {
        return name;
    }
    Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
//        Printable3.super.print();
//        Printable2.super.print();
        System.out.println("gjklfgvhk");
    }

    static void A(String s) {}

    void A(int s) {}

    public static void main(String[] args) {
        Journal journal = new Journal("");
        journal.print();
        Object o = new Object();
        Double i = 10.5;
        System.out.println(Objects.hash(i));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journal journal = (Journal) o;
        return Objects.equals(name, journal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}