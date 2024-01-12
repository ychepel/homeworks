package lesson36.test;

import lesson36.EmptyGenericStackException;
import lesson36.GenericStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericStackTest {
    @Test
    void testPushAndPopIntegerStack() {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(5);
        stack.push(10);
        stack.push(45);
        Integer popValue = stack.pop();
        Assertions.assertEquals(45, popValue);
    }

    @Test
    void testPushAndPopStringStack() {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("hello");
        stack.push("world");
        String popValue = stack.pop();
        Assertions.assertEquals("world", popValue);
    }

    @Test
    void testPopFromEmptyStack() {
        GenericStack<Integer> stack = new GenericStack<>();
        Assertions.assertThrowsExactly(EmptyGenericStackException.class, stack::pop);
    }
}