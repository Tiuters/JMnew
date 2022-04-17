package a.aaaaaa;

import java.util.Objects;

public class clone3 {
}

class Apple implements Cloneable{
    private String color = "red";

    protected Object дайЕщёОдноЯблоко() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

class getIt {
    public static void main(String[] args) throws CloneNotSupportedException {
        Apple apple = new Apple();
        Apple newApple = (Apple) apple.дайЕщёОдноЯблоко();

        System.out.println(apple);
        System.out.println(newApple);
        System.out.println("Ссылки:  " + (apple == newApple));
        System.out.println("Объекты:" + apple.equals(newApple));
    }
}
