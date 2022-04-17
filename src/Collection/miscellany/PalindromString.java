package Collection.miscellany;

public class PalindromString {
    public static void main(String[] args) {
        String str = "ab cb a ";
        System.out.println(isPalindrom(str));
    }

    private static boolean isPalindrom(String str) {
        String str1 = str.replaceAll(" ", "");
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
}
