package chap01ex;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a > 0) {
            System.out.println("양수");
        } else if (a < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
    }
}
