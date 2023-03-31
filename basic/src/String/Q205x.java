package String;

import java.util.HashMap;
import java.util.Map;

public class Q205x {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() <= 1) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (map.containsKey(key)) {
                if (map.get(key).equals(value)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (!map.containsValue(value)) {
                    map.put(key, value);
                }
            }
        }
        return true;
    }
}
