package Lesson39;

import java.util.HashMap;

public class StringUtils {
    public static HashMap<Character, Integer> charFrequently(String str) {
        HashMap<Character, Integer> frequently = new HashMap<>();
        for (Character elem : str.toCharArray()) {
            int elemQuantity = frequently.containsKey(elem) ? frequently.get(elem) : 0;
            frequently.put(elem, ++elemQuantity);
        }
        return frequently;
    }
}
