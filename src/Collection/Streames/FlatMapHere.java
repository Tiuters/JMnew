package Collection.Streames;

import java.util.stream.Stream;

public class FlatMapHere {
    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(
            new Phone("iPhone 6 S", 54000),
            new Phone("Lumia 950", 45000),
            new Phone("Samsung Galaxy S 6", 40000));
        phoneStream
            .flatMap(p-> Stream.of(
                String.format("название: %s            цена без скидки: %d", p.getName(), p.getPrice()),
                String.format("название: %s            цена со скидкой: %d", p.getName(), p.getPrice() -
                    (int)(p.getPrice()*0.1))
            ))
            .forEach(s->System.out.println(s));
    }
}

class Phone {
    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
