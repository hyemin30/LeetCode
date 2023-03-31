package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(i + "와 " + (array.length - 1 - i) + "를 교환합니다");
            swap(array, i, array.length - 1 - i);
            System.out.println(Arrays.toString(array));
        }
        System.out.println("역순정렬 끝!");
    }

    static void swap(int[] array, int a, int b) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
            System.out.println(i + "번쨰는 " + array[i]);
        }

        System.out.println("역순정렬");

        reverse(array);

    }


}
