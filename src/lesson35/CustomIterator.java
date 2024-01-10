package lesson35;

import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {
    private int[] array;
    private int currentIndex = 0;

    public CustomIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public Integer next() {
        return array[currentIndex++];
    }
}
