package chap01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b;

        do {
           b = scan.nextInt();
        } while (b <= a);

        System.out.println(b-a);
    }
}
