package String;

public class Q58 {

    public int lengthOfLastWord(String s) {
        if (!s.contains(" ")) {
            return s.length();
        }

        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}
