package Collection.Algorithms.sort;

import java.util.Arrays;

// https://coderlessons.com/articles/java/binarnyi-poisk-v-java-bez-rekursii-iteratsionnyi-algoritm#:~:text=%D0%91%D0%B8%D0%BD%D0%B0%D1%80%D0%BD%D1%8B%D0%B9%20%D0%BF%D0%BE%D0%B8%D1%81%D0%BA%20%D0%B2%20Java%20%D0%B1%D0%B5%D0%B7%20%D1%80%D0%B5%D0%BA%D1%83%D1%80%D1%81%D0%B8%D0%B8%20%E2%80%94%20%D0%B8%D1%82%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D0%B9%20%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC&text=%D0%92%20%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B5%20%D0%B1%D0%B8%D0%BD%D0%B0%D1%80%D0%BD%D1%8B%D0%B9%20%D0%BF%D0%BE%D0%B8%D1%81%D0%BA%20%D0%B8%D0%BB%D0%B8,%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D1%8F%20%D1%81%D0%BE%20%D1%81%D1%80%D0%B5%D0%B4%D0%BD%D0%B8%D0%BC%20%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%BE%D0%BC%20%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0.
public class IterativeBinarySearch {
    public static void main(String args[]) {

        int[] list = new int[]{23, 43, 31, 12};
        int number = 12;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(list));
        binarySearch(list, 12);

        System.out.printf("Binary Search %d in integer array %s %n", 43, Arrays.toString(list));
        binarySearch(list, 43);

        list = new int[]{123, 243, 331, 1298};
        number = 331;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(list));
        binarySearch(list, 331);

        System.out.printf("Binary Search %d in integer array %s %n", 1333, Arrays.toString(list));
        binarySearch(list, 1333);

        // Using Core Java API and Collection framework
        // Precondition to the Arrays.binarySearch
        Arrays.sort(list);

        // Search an element
        int index = Arrays.binarySearch(list, 3);

    }

    /**
     * Perform a binary Search in Sorted Array in Java
     *
     * @param input
     * @param number
     * @return location of element in array
     */
//    public static void binarySearch(int[] input, int number) {
//        int first = 0;
//        int last = input.length - 1;
//        int middle = (first + last) / 2;
//
//        while (first <= last) {
//            if (input[middle] < number) {
//                first = middle + 1;
//            } else if (input[middle] == number) {
//                System.out.printf(number + " found at location %d %n", middle);
//                break;
//            } else {
//                last = middle - 1;
//            }
//            middle = (first + last) / 2;
//        }
//        if (first > last) {
//            System.out.println(number + " is not present in the list.\n");
//        }
//    }
//    public static void binarySearch(int[] input, int number) {
//
//        int first = 0;
//        int last = input.length - 1;
//        int mid = (last + first) / 2;
//
//        while (first <= last) {
//            if (number < input[mid]) {
//                last = mid - 1;
//            } else if (number == input[mid]) {
//                System.out.println("found at position: " + mid);
//                break;
//            } else {
//                first = mid + 1;
//            }
//            mid = (last + first) / 2;
//        }
//        if (first > last) {
//            System.out.println(number + " not found");
//        }
//    }
    public static void binarySearch(int[] input, int number) {
        int first = 0;
        int last = input.length -1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (number == input[mid]) {
                System.out.println("found at " + mid);
                break;
            } else if (number < input[mid]) {
                last = mid - 1;
                mid = (first + last) / 2;
            } else {
                first = mid + 1;
                mid = (first + last) / 2;
            }

            if (first > last) {
                System.out.println("not found");
            }

        }

    }
}




























