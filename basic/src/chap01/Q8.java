package chap01;

public class Q8 {

    static int sumof(int a, int b) {
        int max = a, min = a;
        if (b > a) {
            max = b;
        } else {
            min = b;
        }

        int total = max * (max + 1) / 2;
        int minus = (min - 1) * min / 2;

        return total - minus;
    }

    public static void main(String[] args) {
        System.out.println(sumof(6,4));
    }
}
