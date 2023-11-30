package sortingHw;

public class Main {
    public static void main(String[] args) {
        StudentSort studentSort = new StudentSort();
        studentSort.addStudent();
        System.out.println("-----------------");
        studentSort.displayList();
        System.out.println("-----------------");
        studentSort.filterStudentByGrade();
        studentSort.displayList();
        System.out.println("-----------------");
        System.out.println("-----------------");
        StudentSort2 studentSort2 = new StudentSort2();
        studentSort2.addStudent();
        System.out.println("-----------------");
        studentSort2.studentDisplay();
        studentSort2.filterStudentByAge();
        System.out.println("-----------------");
        studentSort2.studentDisplay();
        System.out.println("-----------------");
        System.out.println("-----------------");
        StudentSort3 studentSort3 = new StudentSort3();
        studentSort3.addStudent();
        System.out.println("-----------------");
        studentSort3.studentDisplay();
        studentSort3.filterStudentByGrade();
        System.out.println("-----------------");
        studentSort3.studentDisplay();


    }
}
