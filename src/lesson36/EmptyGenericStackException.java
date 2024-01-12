package lesson36;

public class EmptyGenericStackException extends RuntimeException{
    public EmptyGenericStackException() {
        super("generic stack is empty");
    }
}
