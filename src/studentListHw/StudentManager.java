package studentListHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your Student");
        String name = scanner.next();
        System.out.println("Write down surname of your Student");
        String surname = scanner.next();
        System.out.println("Write down age of your Student");
        int age = scanner.nextInt();
        System.out.println("Write down grade of your Student");
        Double grade = scanner.nextDouble();
        Student student = new Student(name, surname, age, grade);
        studentList.add(student);
    }

    public void displayStudents() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public double findMaxAverageGrade() {
        double max = 0;
        for (Student s : studentList) {
            if (max < s.getMiddleGrade()) {
                max = s.getMiddleGrade();
            }
        }
        return max;
    }

    public void filterStudentByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down age of your student");
        int age = scanner.nextInt();
        for (Student s : studentList) {
            if (s.getAge() > age){
                System.out.println(s);
            }
        }
    }

    public boolean isStudentExist(List<Student> students, String nameOfTheStudent, String surname, double grade, int age) {
        for (Student s : students)
            if (s.getName().equalsIgnoreCase(nameOfTheStudent) && s.getSurname().equalsIgnoreCase(surname) && s.getMiddleGrade() == grade && s.getAge() == age) {
                return true;
            }
        return false;
    }
}
