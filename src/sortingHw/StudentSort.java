package sortingHw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort implements Comparator<Student> {
    List<Student> list = new ArrayList<>();

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getName().compareTo(o2.getName()), 0);
    }

    public void addStudent() {
        list.add(new Student("Oleg", 10, 15));
        list.add(new Student("Alexander", 11, 17));
        list.add(new Student("Vasiliy", 9, 14));
    }

    public void filterStudentByGrade() {
        list.sort(new StudentSort());
    }

    public void displayList() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
