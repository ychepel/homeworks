package lesson35;

import java.util.Iterator;

public class CustomList implements Iterable<Integer> {
    private int[] array;

    public CustomList(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(array);
    }

    public int[] toArray() {
        return this.array;
    }

    public void add(int value) {
        int[] newArray = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = value;
        this.array = newArray;
    }

    public void remove(int value) {
        int index = indexOf(value);
        if (index == -1) {
            return;
        }
        int[] newArray = new int[this.array.length - 1];
        int newArrayIndex = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (i != index) {
                newArray[newArrayIndex++] = this.array[i];
            }
        }
        this.array = newArray;
    }

    public void removeAll(int value) {
        int index = indexOf(value);
        while (index != -1) {
            remove(value);
            index = indexOf(value);
        }
    }

    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}
