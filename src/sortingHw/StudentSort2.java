package sortingHw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort2 implements Comparator<Student> {
    List<Student> list = new ArrayList<>();

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public void addStudent() {
        list.add(new Student("Vadim", 12, 18));
        list.add(new Student("Valera", 8, 14));
        list.add(new Student("Alice", 7, 13));
    }

    public void filterStudentByAge() {
        list.sort(new StudentSort2());
    }

    public void studentDisplay() {
        for (Student s : list
        ) {
            System.out.println(s);

        }
    }
}
