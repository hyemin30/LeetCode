package chap01;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;

        do {
            a = scan.nextInt();
        } while (a <= 0);

        int num = 0;
        while (a > 0) {
            a /= 10;
            num++;
        }

        System.out.println(num);

    }
}
