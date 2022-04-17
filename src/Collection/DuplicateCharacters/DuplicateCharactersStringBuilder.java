package Collection.DuplicateCharacters;

public class DuplicateCharactersStringBuilder {
    private static final String INPUT = "AAAAAAAKKKKKLGGGRRRRDSSXYZ";
    private static final String OUTPUT = "A7K5LG3R4DS2XYZ";

    public static void main(String[] args) {
        final String result = convert(INPUT);
        final boolean match = OUTPUT.equals(result);
        System.out.println(match);
        System.out.println(OUTPUT);
        System.out.println(result);
    }

    private static String convert(String src) {
        StringBuilder result = new StringBuilder();
        char curr = '\u0000';
        char next = '\u0000';
        int counter = 1;
        for (int i = 0; i < src.length() - 1; i++) {
            curr = src.charAt(i);
            next = src.charAt(i + 1);

            if (curr == next) {
                counter++;
            } else {
                result.append(curr);
                if (counter != 1) {
                    result.append(String.valueOf(counter));
                }
                counter = 1;
            }
        }

//        if (curr == next) {
//            result.append(curr);
//            if (counter != 1) {
//                result.append(counter);
//            }
//        } else {
//            result.append(next);
//        }
        if (curr != next) {
            result.append(next);
        }



        return result.toString();
    }
}