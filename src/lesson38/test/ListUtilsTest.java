package lesson38.test;

import lesson38.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ListUtilsTest {
    @Test
    void testSumOfSquares() {
        int[] array = new int[]{2, 3, 8, 0};
        Assertions.assertEquals(4 + 9 + 64, ArrayUtils.sumOfSquares(array));
    }

    @Test
    void testFilterLongStrings() {
        String[] strings = new String[]{
                "Lorem ipsum",
                "dolor",
                "sit",
                "amet,",
                "consectetuer",
                "adipiscing",
                "elit."
        };
        String[] expectedResult = new String[]{
                "Lorem ipsum",
                "consectetuer",
                "adipiscing"
        };
        Assertions.assertArrayEquals(expectedResult, ArrayUtils.filterLongStrings(strings));
    }

    @Test
    void testMax() {
        int[] array = new int[] {-6, 50, 34, 9, 100, 0, -400};
        Assertions.assertEquals(100, ArrayUtils.max(array));
    }

    @Test
    void testFindLongest() {
        String[] strings = new String[]{
                "Lorem ipsum",
                "dolor",
                "sit",
                "amet,",
                "consectetuer",
                "adipiscing",
                "elit."
        };
        Assertions.assertEquals("consectetuer", ArrayUtils.findLongest(strings));
    }
}