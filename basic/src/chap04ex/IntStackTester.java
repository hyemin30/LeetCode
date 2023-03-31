package chap04ex;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        IntStack s = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.println("1.푸시 2.팝 3.피크 4.덤프 5.종료");

            int menu = scan.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.println("입력할데이터: ");
                    x = scan.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택 가득 참");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝 데이터 " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택 비었음");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("픽 데이터 " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택 비었음");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
