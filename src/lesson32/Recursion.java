package lesson32;

public class Recursion {
    public static int sum(Object[] array) {
        int total = 0;
        for (Object element : array) {
            total += (element instanceof Object[]) ? sum((Object[]) element) : (int) element;
        }
        return total;
    }
}
