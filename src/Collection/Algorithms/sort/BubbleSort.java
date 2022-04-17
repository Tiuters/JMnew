package Collection.Algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testData = {10, 4, 43, 5, 4, 67, 12, 0, 99, 19};
        System.out.println(Arrays.toString(bubbleSort(testData)));
    }

//    public static int[] bubbleSort(int[] array) {
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        return array;
//    }

    private static int[] bubbleSort(int[] testData) {
        return testData;
    }
}