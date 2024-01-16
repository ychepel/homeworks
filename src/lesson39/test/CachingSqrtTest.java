package lesson39.test;

import lesson39.CachingSqrt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CachingSqrtTest {
    @Test
    void testSqrt() {
        Assertions.assertEquals(25, CachingSqrt.sqrt(5));
    }

    @Test
    void testCacheSqrt() {
        CachingSqrt.sqrt(3);
        CachingSqrt.sqrt(4);
        CachingSqrt.sqrt(5);
        Assertions.assertEquals(16, CachingSqrt.cacheSqrt(4));
    }
}