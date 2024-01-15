package lesson37;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        runTask1();
        runTask2();
        runTask3();
    }

    private static void runTask1() {
        System.out.println("\n*** Task #1 ***");
        ArrayList<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Name1", "3054889456564"));
        contactList.add(new Contact("Name2", "4654654654564"));
        contactList.add(new Contact("Name3", "1324564987987"));
        contactList.add(new Contact("Name4", "8456465489988"));
        contactList.add(new Contact("Name5", "1321654789879"));
        for (Contact contact : contactList) {
            System.out.println(contact.info());
        }
    }

    private static void runTask2() {
        System.out.println("\n*** Task #2 ***");
        Random random = new Random();
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentList.add(new Student(random.nextInt(30 - 17) + 17, random.nextInt(10)));
        }
        Student maxGradeStudent = studentList.get(0);
        for (int i = 1; i < studentList.size(); i++) {
            if (maxGradeStudent.getGrade() < studentList.get(i).getGrade()) {
                maxGradeStudent = studentList.get(i);
            }
        }
        System.out.println("Student with max grade: " + maxGradeStudent);
    }

    private static void runTask3() {
        System.out.println("\n*** Task #3 ***");
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new PartTimeEmployee("Name1", "Surname1", 15, 168));
        employeeList.add(new PartTimeEmployee("Name2", "Surname2", 17.3, 150));
        employeeList.add(new PartTimeEmployee("Name3", "Surname3", 11, 160));
        employeeList.add(new FullTimeEmployee("Name4", "Surname4", 2545));
        employeeList.add(new FullTimeEmployee("Name5", "Surname5", 3600));
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total employees salary: " + totalSalary);
    }
}
