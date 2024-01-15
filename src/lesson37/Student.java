package lesson37;

public class Student {
    private int age;
    private int grade;

    public Student(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                '}';
    }
}
