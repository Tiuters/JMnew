package Collection.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class NullInList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(3);
//        list1.add(null);
//        list1.add(8);

        print1(list1);
    }

    private static void print1(List<Integer> l) {
        int hg = 0;                                                                              // С пустым листом норм.
        for (Integer in : l) {           // Exception in thread "main" java.lang.NullPointerException
            hg += in;
            System.out.println(hg);
        }
    }
}
