package chap02ex;

import java.util.Scanner;

public class CardConv {

    static int cardConv(int no, int change, char[] cno) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            cno[digits++] = dchar.charAt(no % change);
            no /= change;
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
