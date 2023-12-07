package lesson22;

public class Manager extends Employee {
    private int level;

    public Manager(String name, double salary, int level) {
        super(name, salary);
        setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1 || level > 10) {
            throw new IllegalArgumentException("invalid value of level");
        }
        this.level = level;
    }
}
