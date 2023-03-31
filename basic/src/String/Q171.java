package String;

public class Q171 {

    public static int titleToNumber(String columnTitle) {

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (columnTitle.length() == 1) {
            return abc.indexOf(columnTitle) + 1;
        }

        int answer = abc.indexOf(columnTitle.charAt(columnTitle.length()-1)) + 1;
        int count = 1;
        for (int i = columnTitle.length() - 2; i >= 0; i--) {

            answer += (int) (Math.pow(26, count) * (abc.indexOf(columnTitle.charAt(i)) + 1));
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
