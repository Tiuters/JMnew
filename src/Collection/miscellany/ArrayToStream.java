package Collection.miscellany;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        char[] ar = {'a', 'b', 'c', 'a', 'd', 'a', 'c', 'a', 'r', 'r', 'd', 'c'};

//        Stream.of(ar).forEach();
    }
}

/*Напишите код, который принимает первых 10 положительных
    чисел.(массив из 10 элементов)
    программа должна определить:
    • сколько раз каждая из цифр встречалась в серии;
    • какая цифра (цифры) встречалась в серии чаще всего;
    • какая цифра (цифры) вообще ни разу не встречались в серии;
    • какая цифра (цифры) встречалась в серии реже всего.*/
class IntArray {
    public static void main(String[] args) {
        int [] digits = {1,2,3,3,4,6,6,7,8,9};
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(digits).forEach(d -> map.merge(d, 1, Integer::sum));
        map.entrySet().forEach(System.out::println);


    }
}

class StringToStream {
    public static void main(String[] args) {
        String str = "AAAAAAAKKKKKLGGGRRRRDSSXYZ";

//        str.chars().forEach();
    }
}