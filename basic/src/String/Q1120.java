package String;

class Q1120 {

    public static void solution(String a, String b) {
        int answer = a.length();

        for (int i = 0; i <= b.length() - a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    count++;
                }
            }
            answer = Math.min(count, answer);
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        solution("adaabc", "aababbc");
    }
}
