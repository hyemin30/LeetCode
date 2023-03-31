package String;

public class Q14 {

    public static String longestCommonPrefix(String[] strs) {

        int min = 200;
        String minStr = "";

        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
                minStr = str;
            }
        }

        if (min == 0) {
            return "";
        }


        String answer = "";
        int count = 0;
        for (int i = min - 1; i >= 0; i--) {
            if (count == strs.length) {
                break;
            } else {
                count = 0;
            }
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(minStr.substring(0, i + 1))) {
                    break;
                }
                count++;
                if (count == strs.length) {
                    answer = minStr.substring(0, i + 1);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"reflower","flow","flight"}));;
    }
}

