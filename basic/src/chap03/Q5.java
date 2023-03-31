package chap03;

import java.util.Scanner;

public class Q5 {

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


        do {
            int center = (left + right) / 2;
            if (array[center] == key) {
                do {
                    center--;
                } while (array[center] == key);
                return center+1;
            } else if (array[center] < key) {
                left = center;
            } else {
                right = center;
            }
        } while (left <= right);


        return -1;

    }

}
