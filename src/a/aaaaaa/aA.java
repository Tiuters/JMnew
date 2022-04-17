package a.aaaaaa;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class aA {

    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            sc.nextInt();
            arr.addFirst(sc.nextInt());
        }
        for (Integer a : arr) {
            System.out.println(a.intValue());
        }
    }
}

class Program{

    public static void main(String[] args) {

        System.out.println(sum(2, 3));          // 5
        System.out.println(sum(4.5, 3.2));      // 7.7
        System.out.println(sum(4, 3, 7));       // 14
    }
    static int sum(int x, int y){

        return x + y;
    }
    static double sum(double x, double y){

        return x + y;
    }
    static int sum(int x, int y, int z){

        return x + y + z;
    }
}





























