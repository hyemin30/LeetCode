package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();

        int[] array = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - i - 1];
        }

        System.out.println(Arrays.toString(array2));


    }


}
