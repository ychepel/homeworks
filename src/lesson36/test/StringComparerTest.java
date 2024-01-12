package lesson36.test;

import lesson36.StringComparer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringComparerTest {
    @Test
    void testCompareDifferentLengths() {
        StringComparer comparer = new StringComparer();
        Assertions.assertEquals(4, comparer.compare("some long text", "short text"));
    }

    @Test
    void testCompareSameLengths() {
        StringComparer comparer = new StringComparer();
        Assertions.assertEquals(0, comparer.compare("some long  text", "some short text"));
    }
}
