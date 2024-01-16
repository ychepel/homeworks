package Lesson39;

import java.util.HashMap;
import java.util.Objects;

public class CachingSqrt {
    private static HashMap<Double, Double> cache = new HashMap<>();

    public static double sqrt(double number) {
        double result = Math.pow(number, 2);
        CachingSqrt.cache.put(number, result);
        return result;
    }

    public static double cacheSqrt(double number) {
        double cachedValue = CachingSqrt.cache.get(number);
        return Objects.nonNull(cachedValue) ? cachedValue : CachingSqrt.sqrt(number);
    }
}
