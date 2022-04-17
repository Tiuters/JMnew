package Collection.miscellany;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "qwe";
        String s2 = "qewr";
        String s3 = "wqe";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram2(s1, s3));
    }

    static boolean isAnagram(String s1, String s2) {

        return Arrays.equals(s1.chars().sorted().toArray(),
            s2.chars().sorted().toArray());
    }

    private static boolean isAnagram2(String s1, String s2) {
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

}