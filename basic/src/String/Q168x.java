package String;

public class Q168x {

    public static String convertToTitle(int columnNumber) {

        String[] array = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        if (columnNumber <= 26) {
            return array[columnNumber - 1];
        }

        String a = "", b = "";
        int num1 = columnNumber / 26;
        if (num1 <= 26) {
            a = array[num1 - 1];
            b = array[columnNumber % 26 - 1];
        }

        return a + b;
    }

    public static void main(String[] args) {
        convertToTitle(1);
    }
}
