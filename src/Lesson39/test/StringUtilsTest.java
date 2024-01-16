package Lesson39.test;

import Lesson39.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

class StringUtilsTest {
    @Test
    void testCharFrequently() {
        String str = "abc abc bcdbcdbcd";
        HashMap<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('a', 2);
        expectedResult.put('b', 5);
        expectedResult.put('c', 5);
        expectedResult.put(' ', 2);
        expectedResult.put('d', 3);
        assertEquals(expectedResult, StringUtils.charFrequently(str));
    }
}