package String;
public class Q67 {

    public static String addBinary(String a, String b) {

        if (a.length() <= b.length()) {
            a = "0".repeat(b.length() - a.length()) + a;
        } else {
            b = "0".repeat(a.length() - b.length()) + b;
        }

        String answer = "";

        int temp = 0;
        for (int i = a.length() - 1; i >= 0; i--) {

            int add = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + temp;

            if (add == 0) {
                temp = 0;
                answer = "0" + answer;
            } else if (add == 1) {
                temp = 0;
                answer = "1" + answer;
            } else if (add == 2) {
                temp = 1;
                answer = "0" + answer;
            } else if (add == 3) {
                temp = 1;
                answer = "1" + answer;
            }
        }
        if (temp == 1) {
            answer = "1" + answer;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
