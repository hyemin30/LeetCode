package chap03;

import java.util.Scanner;

public class Q1 {

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

        int i = 0;
        for (i = 0; array[i] != search; i++)
            ;

        return i == num ? -1 : i;
    }
}
