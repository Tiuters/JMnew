package Collection.DuplicateCharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

// https://qna.habr.com/q/111261
public class DuplicateCharactersMap {
    public static void main(String[] args) {
        withMap1();
        withMap2();
        withMap3(); // https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
        withMap4();
    }

    public static void withMap1() {
        Map<Character, Integer> myMap = new HashMap<>();

        Character[] myArray = {'a', 'b', 'd', 'f', 'a', 'd', 'a', 'r', 'a', 'd', 'v', 'b', 'd', 'b', 'a', 't', 'r', 'e', 'v', 'd', 'a', 'g', 'a', 'b'};
        List<Character> myList = Arrays.asList(myArray);

        for (int i = 0; i < myList.size(); i++) {
            Character tempChar = myList.get(i);

            if (!myMap.containsKey(tempChar)) {
                myMap.put(tempChar, 1);
            } else {
                myMap.put(tempChar, myMap.get(tempChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
//            System.out.println("Буква: " + entry.getKey() + "    Повторений:" + entry.getValue());
            System.out.print(entry.getKey() + " " + entry.getValue() + ",   ");
        }
    }

    public static void withMap2() {
        Map<Character, Integer> myMap = new HashMap<>();

        Character[] ar = {'a', 'b', 'c', 'a', 'd', 'a', 'c', 'a', 'r', 'r', 'd', 'c'};
        List<Character> myList = Arrays.asList(ar);

        for (int i = 0; i < ar.length; i++) {
            Character tempCh = ar[i];
            if (!myMap.containsKey(tempCh)) {
                myMap.put(tempCh, 1);
            } else {
                myMap.put(tempCh, myMap.get(tempCh) + 1);
            }
        }

        System.out.println();
        for (Map.Entry<Character, Integer> e : myMap.entrySet()) {
//            System.out.println("Ch: " + entry.getKey() + "   Count: " + entry.getValue());
            System.out.print(e.getKey() + " " + e.getValue() + ",   ");
        }
    }

    public static void withMap3() {
        Map<Character, Integer> myMap = new HashMap<>();
        char[] ar = {'a', 'b', 'c', 'a', 'd', 'a', 'c', 'a', 'r', 'r', 'd', 'c'};

        for (int i = 0; i < ar.length; i++) {
            Integer freq = myMap.get(ar[i]);
            myMap.put(ar[i], (freq == null) ? 1 : freq + 1);
        }

        System.out.print("\nwithMap3:   ");
        for (Map.Entry<Character, Integer> e : myMap.entrySet()) {
            System.out.print(e.getKey().toString() + e.getValue());
        }
    }

    public static void withMap4() {
        Map<Character, Integer> myMap = new LinkedHashMap<>();
        String str = "AAAAAAAKKKKKLGGGRRRRDSSXYZ";
        System.out.print("\nwithMap4:   ");
//        for (int i = 0; i < str.length(); i++) {
//            Integer freq = myMap.get(str.charAt(i));
//            myMap.put(str.charAt(i), (freq == null) ? 1 : freq + 1);
//        }
//
//        System.out.println();
//        for (Map.Entry<Character, Integer> e : myMap.entrySet()) {
//            char key = e.getKey();
//            String s = (e.getValue() == 1) ? "" : e.getValue().toString();
//            System.out.print(key + s);             // A7K5LG3R4DS2XYZ

// **********************************************************************************************
//        for (
//            int i = 0; i < str.length(); i++) {
//            Integer freq = myMap.get(str.charAt(i));
//            myMap.put(str.charAt(i), (freq == null) ? 1 : freq + 1);
//        }
//        for (
//            Map.Entry<Character, Integer> entry : myMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.print(entry.getKey().toString());
//            } else {
//                System.out.print(entry.getKey().toString() + entry.getValue());
//            }
//        }
// *********************************************************************************************

    }
}


























