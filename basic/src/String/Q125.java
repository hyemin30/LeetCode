package String;

import java.util.Stack;

public class Q125 {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String temp = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                temp += c;
                stack.push(c);
            }
        }

        System.out.println("temp = " + temp);

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
