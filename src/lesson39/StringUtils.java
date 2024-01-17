package lesson39;

import java.util.HashMap;

public class StringUtils {
    public static HashMap<Character, Integer> charFrequency(String str) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (Character elem : str.toCharArray()) {
            int elemQuantity = frequency.containsKey(elem) ? frequency.get(elem) : 0;
            frequency.put(elem, ++elemQuantity);
        }
        return frequency;
    }
}
