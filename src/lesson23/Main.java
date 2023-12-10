package lesson23;

public class Main {
    public static void main(String[] args) {
        BugFixTask bugFixTask1 = new BugFixTask("Author1");
        BugFixTask bugFixTask2 = new BugFixTask("Author2");
        bugFixTask2.execute("Executor2");

        System.out.println(bugFixTask1);
        System.out.println(bugFixTask2);
    }
}
