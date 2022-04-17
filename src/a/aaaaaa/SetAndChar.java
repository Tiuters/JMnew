package a.aaaaaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetAndChar {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

        System.out.println("list:  " + list);
        System.out.println("set:  " + set);
//******************************************************************************************************************************
        List<Character> list2 = new ArrayList<>();
        list2.add('f');
        list2.add('e');
        list2.add('d');
        list2.add('c');
        list2.add('b');
        list2.add('a');
        Character[] ar2 = list2.toArray(new Character[0]);
        System.out.print("Массив:    ");
        for (Character character : ar2) {System.out.print(character + "  ");}

        Set<Character> set2 = new HashSet<>();
        set2.addAll(list2);

        System.out.println("\nlist2:        " + list2);
        System.out.println("set2:        " + set2);
        System.out.println("set2.hashCode():    " + set2.hashCode());

        System.out.print("Хэш-коды символов:  ");
        for (int i ='a'; i < (int) 'g'; i++) {
            System.out.print(Character.hashCode((char) i) + ",  ");
        }
//*****************************************************************************************************************************

        System.out.println("\n");
        for (int i = 977; i < 1003; i++) {
            System.out.print((char) i + ",  ");
        }
//*****************************************************************************************************************************
        System.out.println("\n");
        String i = "\u0069\u006E\u0074 \u0069 \u003D \u0038\u003B";
        System.out.println(i);

        Iterator<Integer> iterator = list.iterator();
    }

}

// https://www.delftstack.com/ru/howto/java/string-to-hex-java/
class StringToHex {
    public static void main(String[] args) {

        String stringToConvert = "This is a string";

        convertStringToHex(stringToConvert);
    }

    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }

        System.out.println("Converted Hex from String: "+stringBuilder.toString());
    }
}
