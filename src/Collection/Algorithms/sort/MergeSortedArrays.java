package Collection.Algorithms.sort;

import java.util.Arrays;

// https://www.youtube.com/watch?v=RJkn1DXyH3U&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=41
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1, 3, 6, 9};
        int[] secondArray = new int[] {2, 4, 4, 7};

        int[] result = merge(firstArray, secondArray);
        System.out.println(Arrays.toString(result));
        int[] result2 = mergeArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(result2));
    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < result.length; i++) {
            if (l >= firstArray.length) {
                result[i] = secondArray[r];
                r += 1;
            } else if (r >= secondArray.length) {
                result[i] = firstArray[l];
                l+= 1;
            } else if (firstArray[l] < secondArray[r]) {
                result[i] = firstArray[l];
                l+= 1;
            } else {
                result[i] = secondArray[r];
                r+= 1;
            }
        }
        return result;
    }

    // Моё решение задачи 2.4.17
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int l1 = a1.length;
        int l2 = a2.length;
        int[] res = new int[l1 + l2];

        int index1 = 0;
        int index2 = 0;
        int i = 0;

        while ((index1 < l1) && (index2 < l2)) {
            if (a1[index1] <= a2[index2]) {
                res[i++] = a1[index1++];
            } else {
                res[i++] = a2[index2++];
            }
        }
        while (index1 < l1) {
            res[i++] = a1[index1++];
        }
        while (index2 < l2) {
            res[i++] = a2[index2++];
        }
        return res;
    }
}
