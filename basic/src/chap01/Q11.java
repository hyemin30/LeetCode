package chap01;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1;i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+---------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
            System.out.print("|");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
