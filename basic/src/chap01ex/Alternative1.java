package chap01ex;

import java.util.Scanner;

public class Alternative1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        do {
            n = scan.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }

    }
}
