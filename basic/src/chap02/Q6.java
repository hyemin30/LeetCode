package chap02;

import java.util.Scanner;

public class Q6 {

    static int cardConv(int no, int change, char[] cno) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.printf("%d | %5d%n", change, no);
        System.out.println("  +-------");

        do {
            int rest = no % change;
            cno[digits++] = dchar.charAt(rest);
            no /= change;

            if (no != 0) {
                System.out.printf("%d | %5d ... %d%n", change, no, rest);
                System.out.println("  +-------");
            } else {
                System.out.printf("    %5d ... %d%n", no, 1);
            }
        } while (no != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = cno[i];
            cno[i] = cno[digits - i - 1];
            cno[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int no;
        int change;
        int dno;
        char[] cno = new char[32];

        System.out.println("음이 아닌 정수");
        no = scan.nextInt();

        System.out.println("몇진수로 변환?");
        change = scan.nextInt();

        dno = cardConv(no, change, cno);

        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
    }
}
