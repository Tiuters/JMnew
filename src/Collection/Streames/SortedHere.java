package Collection.Streames;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortedHere {
}

class Program {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(
            new Phone2("iPhoneX", "Apple", 600),
            new Phone2("Pixel 2", "Google", 500),
            new Phone2("iPhone 8", "Apple",450),
            new Phone2("Nokia 9", "HMD Global",150),
            new Phone2("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
            .forEach(p->System.out.printf("%s (%s) - %d \n",
                p.getName(), p.getCompany(), p.getPrice()));
    }
}

class PhoneComparator implements Comparator<Phone2>{
    public int compare(Phone2 a, Phone2 b){
        return
            a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}


class Phone2 {
    private String name;
    private String company;
    private int price;

    public Phone2(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }
    public String getName() { return
        name; }
    public int getPrice() { return
        price; }
    public String getCompany() {
        return company; }
}