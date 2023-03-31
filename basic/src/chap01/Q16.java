package chap01;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
