package sortingHw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort3 implements Comparator<Student> {
    List<Student> list = new ArrayList<>();
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGrade(), o2.getGrade());
    }
    public void addStudent(){
        list.add(new Student("Vlad", 11, 17));
        list.add(new Student("Aaron", 3, 9));
        list.add(new Student("Vladimir", 5, 11));
    }
    public void filterStudentByGrade() {
        list.sort(new StudentSort3());
    }
    public void studentDisplay() {
        for (Student s : list
        ) {
            System.out.println(s);

        }
    }
}
