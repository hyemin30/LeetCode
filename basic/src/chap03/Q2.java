package chap03;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] array = new int[num+1];

        System.out.println("요소 입력");
        for (int i = 0; i < num; i++) {
            array[i] =scan.nextInt();
        }
        System.out.println("검색할 값");
        int search = scan.nextInt();

        int idx = seqSearch(array, num, search);

        if (idx == -1) {
            System.out.println("NOPE");
        } else {
            System.out.println(idx + "번쨰 있음");
        }

    }

    static int seqSearch(int[] array, int num, int search) {

        array[num] = search;

        System.out.print("   |");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+-----------------------");

        int i = 0;
        for (i = 0; array[i] != search; i++) {
            System.out.print("   |");
            System.out.print(" ".repeat(i * 3 + 2) + "*");
            System.out.println();
            System.out.printf("%3d|", i);

            for (int j = 0; j < array.length - 1; j++) {
                System.out.printf("%3d", array[j]);
            }
            System.out.println();
        }

        return i == num ? -1 : i;
    }
}
