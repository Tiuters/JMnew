package Collection.miscellany;

public class PalindromInt {
    public static void main(String[] args) {
        int num = 212131212;
        System.out.println(isPalindrom(num));
    }
// **********************  Через строку ***********************
    private static boolean isPalindrom(int num) {

        StringBuilder sb = new StringBuilder();
        String str1 = String.valueOf(num);
        String str2 = sb.append(str1).reverse().toString();
        return str1.equals(str2);

    }
}


