package Collection.DuplicateCharacters;

// THE COMPLETE CODING INTERVIEW GUIDE IN JAVA by Anghel Leonard (z-lib.org)
// p 300
public class StringShrinker {
    public static void main(String[] a) {
        System.out.println(shrink("ААBBBBBCCCG"));
        System.out.println(shrink2("ААBBBBBCCCG"));
    }

    public static String shrink(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
            if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                result.append(str.charAt(i))
                    .append(count);
                count = 0;
            }
        }
        return result.length() > str.length() ? str : result.toString();
    }

    // С ПРОВЕРКОЙ НА ПРОБЕЛЫ:

    public static String shrink2(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
// we don't count whitespaces, we just copy them
            if (!Character.isWhitespace(str.charAt(i))) {
// if there are no more characters
// or the next character is different
// from the counted one
                if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
// append to the final result the counted character
// and number of consecutive occurrences
                    result.append(str.charAt(i))
                        .append(count);
// reset the counter since this
// sequence was appended to the result
                    count = 0;
                }
            } else {
                result.append(str.charAt(i));
                count = 0;
            }
        }
// return the result only if it is
// shorter than the given string
        return result.length() > str.length()
            ? str : result.toString();
    }
}
