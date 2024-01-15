package lesson38;

import java.util.Arrays;

public class ArrayUtils {
    public static int sumOfSquares(int[] ints) {
        return Arrays.stream(ints)
                .reduce(0, (acc, elem) -> acc + elem * elem);
    }

    public static String[] filterLongStrings(String[] strings) {
        return Arrays.stream(strings)
                .filter(x -> x.length() > 5)
                .toArray(String[]::new);
    }

    public static int max(int[] ints) {
        if (ints.length == 0) {
            throw new IllegalArgumentException("array should not be empty");
        }
        int firstElem = ints[0];
        return Arrays.stream(ints)
                .reduce(firstElem, Math::max);
    }

    public static String findLongest(String[] strings) {
        if (strings.length == 0) {
            throw new IllegalArgumentException("array should not be empty");
        }
        String firstString = strings[0];
        return Arrays.stream(strings)
                .reduce(firstString, (acc, elem) -> acc.length() < elem.length() ? elem : acc);
    }
}
