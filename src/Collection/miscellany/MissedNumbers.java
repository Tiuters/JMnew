package Collection.miscellany;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// ************************ Найти пропущенные числа ***************
public class MissedNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 8, 7};
        findMissed(arr);
        System.out.println("With set:  " + Arrays.toString(findMissedWithSet(arr)));
    }

    private static void findMissed(int[] arr) {

        Arrays.sort(arr);
        int[] arr2 = new int[arr[arr.length - 1]];

        for (int i : arr) {
            arr2[i - 1] = 1;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }

    private static int[] findMissedWithSet(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int missing = max - arr.length;
        int[] res = new int[missing];
        int index = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}

