package chap01ex;

import java.util.Scanner;

public class TriangleLB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" *".repeat(i));
        }
    }
}
