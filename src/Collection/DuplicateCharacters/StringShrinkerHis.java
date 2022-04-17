package Collection.DuplicateCharacters;

// https://pastebin.com/71bd7AQK
public class StringShrinkerHis {

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

            if (curr == next) {
                result.append(curr);
                if (counter != 1) {
                    result.append(counter);
                }
            } else {
                result.append(next);
            }

            return result.toString();
        }
    }

class Myshr {
    public static void main(String[] args) {
        String str = "AAAAAAAKKKKKLGGGRRRRDSSXYZZA";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char curr = '\u0000';
        char next = '\u0000';

        for (int i = 0; i < str.length() - 1; i++) {
            curr = str.charAt(i);
            next = str.charAt(i + 1);
            if (curr == next) {
                count++;
            } else {
                sb.append(curr);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        if (curr == next) {
            sb.append(curr);
            if (count != 1) {
                sb.append(count);
            }
        }
        else {
            sb.append(next);
        }

        System.out.println(sb);
    }
}
