package level1;

import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {

    //todo 해결못함
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        //각각의 문자마다 해당되는 입력 번호를 찾아서 매핑한다
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char keyChar = key.charAt(i);
                int charNum = i + 1;
                int findNum = map.getOrDefault(keyChar, 1000);

                map.put(keyChar, Math.min(charNum, findNum));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean success = true;

            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                char findChar = target.charAt(j);
                int findNum = map.getOrDefault(findChar, -1);

                //해당하는 값을 찾아오지 못하면 -1로 저장
                if (findNum == -1) {
                    success = false;
                    break;
                }

                sum += findNum;
            }
            if (success) {
                answer[i] = sum;
            } else {
                answer[i] = -1;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"});
    }
}
