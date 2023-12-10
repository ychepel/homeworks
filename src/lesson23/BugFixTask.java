package lesson23;

public class BugFixTask extends Task {
    private String author;
    private String executor;

    public BugFixTask(String author) {
        this.author = author;
        this.executor = "Unknown";
    }

    public void execute(String executor) {
        super.execute();
        this.executor = executor;
    }

    @Override
    public String toString() {
        if (super.solved) {
            return String.format("Задача решена! Автор: %s Исполнитель: %s", author, executor);
        } else {
            return String.format("Задача в процессе решения! Автор: %s", author);
        }
    }
}
