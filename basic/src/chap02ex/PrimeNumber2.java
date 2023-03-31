package chap02ex;

public class PrimeNumber2 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 0; n < 1000; n += 2) {
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[ptr] == 0) {
                    break;
                }
            }

            if (ptr == i) {
                prime[ptr++] = n;
            }
        }
    }
}
