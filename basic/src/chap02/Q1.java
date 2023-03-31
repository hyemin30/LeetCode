package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(10);
        int[] height = new int[num];
        System.out.println("사람 수는 " + num);
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println(i + "번째 키: " + height[i]);
        }

        System.out.println(maxOf(height));
    }
}
