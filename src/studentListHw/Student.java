package studentListHw;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double middleGrade;

    public Student(String name, String surname, int age, double middleGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.middleGrade = middleGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMiddleGrade() {
        return middleGrade;
    }

    public void setMiddleGrade(double middleGrade) {
        this.middleGrade = middleGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", middleGrade=" + middleGrade +
                '}';
    }
}
