package chap03;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("요소 갯수");
        int num = scan.nextInt();
        int[] array = new int[num];
        array[0] = scan.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                array[i] = scan.nextInt();
            } while (array[i] < array[i - 1]);
        }

        System.out.println("검색할 값");
        int key = scan.nextInt();

        int idx = binSearch(array, num, key);

        if (idx == -1) {
            System.out.println("NOPE");
        } else {
            System.out.println(idx + "번째 있음");
        }

    }

    static int binSearch(int[] array, int num, int key) {

        int left = 0;
        int right = num - 1;

        System.out.print("   |");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+-----------------------");

        do {
            int center = (left + right) / 2;
            System.out.println("   |" + "   ".repeat(left) + "<-" + "   ".repeat(center-left) + "+" + "   ".repeat(right-center) + "->");
            System.out.printf("%3d|",center);
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%3d", array[i]);
            }
            System.out.println();
            if (array[center] == key) {
                return center;
            } else if (array[center] < key) {
                left = center+1;
            } else {
                right = center-1;
            }
        } while (left <= right);

        return -1;

    }

}
