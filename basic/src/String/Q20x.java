package String;

import java.util.Stack;

public class Q20x {
    public static boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                chars.push(a);
            } else if (chars.empty()) {
                return false;
            } else if (a == ')' && chars.pop() != '(') {
                System.out.println("왜아니야");
                return false;
            }else if (a == ']' && chars.pop() != '[') {
                return false;
            }else if (a == '}' && chars.pop() != '{') {
                return false;
            }
        }
        return chars.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
