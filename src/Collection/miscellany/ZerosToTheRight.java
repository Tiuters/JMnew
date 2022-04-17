package Collection.miscellany;

import java.util.Arrays;

public class ZerosToTheRight {
    public static void main(String[] args) {
        int[] init = {3, 5, 0, 2, 0, 1};
        System.out.println(Arrays.toString(init));
        moveZeroes(init);
    }

    public static void moveZeroes(int[] nums) {
        if(nums == null){
            System.out.println("Null array!");
        } else{
            int zeroCounter = nums.length;
            int index = 0;

            //Place nonzero elements from the beginning,
            //and count the amount of zeros.
            for(int i = 0; i<nums.length; i++){
                if(nums[i] != 0){
                    zeroCounter--;
                    nums[index] = nums[i];
                    index++;
                }
            }
            //Put zeros to the remaining part of the array
            while(zeroCounter > 0){
                nums[index] = 0;
                index++;
                zeroCounter--;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}

/* Java program to push zeroes to back of array */
// https://www.geeksforgeeks.org/move-zeroes-end-array/
class PushZero {
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    static void pushZerosToEnd(int arr[], int n) {

        long start = System.nanoTime();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }

        long stop = System.nanoTime() ;
        System.out.println(Arrays.toString(arr));
        System.out.println(stop - start);
    }
}

class V {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        long start = System.nanoTime();

        int nullsCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ++nullsCounter;
            } else if (nullsCounter > 0) {
                arr[i - nullsCounter] = arr[i];
                arr[i] = 0;
            }
        }

        long stop = System.nanoTime() ;
        System.out.println(Arrays.toString(arr));
        System.out.println(stop - start);
    }
}
