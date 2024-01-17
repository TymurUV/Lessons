package studentListHw;

import java.util.Comparator;

public class StudentSortByGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getMiddleGrade(), o2.getMiddleGrade());
    }
}
