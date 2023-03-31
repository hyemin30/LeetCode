package chap01ex;

import java.util.Scanner;

public class PrintStars1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int w = scan.nextInt();

//        for (int i = 0; i < n / w; i++) {
//            for (int j = 0; j < w; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n % w; i++) {
//            System.out.print("*");
//        }

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }
        System.out.println("*".repeat(n % w));

    }
}
