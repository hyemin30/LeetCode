package chap03;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("전체갯수 :");
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("키 값은?");
        int key = scan.nextInt();
        int[] idx = new int[n];

        System.out.println("총 갯수는 : " + searchIdx(array, n, key, idx));
    }

    static int searchIdx(int[] array, int n, int key, int[] idx) {
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == key) {
                idx[index++] = i;
            }
        }

        return index+1;
    }
}
