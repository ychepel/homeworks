package lesson36;

import java.util.EmptyStackException;

public class GenericStack<T> {
    private T[] stack;

    public GenericStack() {
        this.stack = (T[]) new Object[0];
    }

    public void push(T value) {
        T[] newStack = (T[]) new Object[this.stack.length + 1];
        for (int i = 0; i < this.stack.length; i++) {
            newStack[i] = this.stack[i];
        }
        newStack[this.stack.length] = value;
        this.stack = newStack;
    }

    public T pop() {
        int lastIndex = this.stack.length - 1;
        if (lastIndex < 0) {
            throw new EmptyGenericStackException();
        }
        T value = this.stack[lastIndex];
        T[] newStack = (T[]) new Object[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        return value;
    }
}
