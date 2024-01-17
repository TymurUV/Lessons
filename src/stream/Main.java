package stream;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Oleg", 25),
                new Student("Sasha", 19),
                new Student("Alex", 45),
                new Student("Bob", 50)
        );
        Double averageGrade = studentList.stream()
                .mapToDouble(s -> s.getAge())
                .average()
                .orElse(0.0);
        System.out.println(averageGrade);
        List<Student> students = studentList.stream()
                .filter(a -> a.getAge() > 30)
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .toList();
        System.out.println(students);
        String searchName = "Aboba";
        Optional<Student> student = findStudent(studentList, searchName);
        student.ifPresentOrElse(
                s -> System.out.println(s),
                () -> System.out.println("Not found")
        );
    }

    private static Optional<Student> findStudent(List<Student> students, String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
