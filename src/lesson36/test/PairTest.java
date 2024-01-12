package lesson36.test;

import lesson36.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {
    @Test
    void testStringAndBooleanGetters() {
        Pair<String, Boolean> pair = new Pair<>("all done", true);
        Assertions.assertEquals("all done", pair.getFirst());
        Assertions.assertEquals(true, pair.getSecond());
    }
}
