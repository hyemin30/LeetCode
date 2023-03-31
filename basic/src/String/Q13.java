package String;

public class Q13 {
    public int romanToInt(String s) {

        String[] split = s.split("");
        int answer = 0;

        for (int i = 0; i < split.length; i++) {
            switch (split[i]) {
                case "I":
                    if (i == split.length - 1) {
                        answer += 1;
                        break;
                    }
                    if (split[i + 1].equals("V") || split[i + 1].equals("X")) {
                        answer -= 1;
                    } else {
                        answer += 1;
                    }
                    break;
                case "V":
                    answer += 5;
                    break;
                case "X":
                    if (i == split.length - 1) {
                        answer += 10;
                        break;
                    }
                    if (split[i + 1].equals("L") || split[i + 1].equals("C")) {
                        answer -= 10;
                    } else {
                        answer += 10;
                    }
                    break;
                case "L":
                    answer += 50;
                    break;
                case "C":
                    if (i == split.length - 1) {
                        answer += 100;
                        break;
                    }
                    if (split[i + 1].equals("D") || split[i + 1].equals("M")) {
                        answer -= 100;
                    } else {
                        answer += 100;
                    }
                    break;
                case "D":
                    answer += 500;
                    break;
                case "M":
                    answer += 1000;
                    break;
            }
        }
        return answer;
    }
}
