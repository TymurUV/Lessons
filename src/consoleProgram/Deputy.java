package consoleProgram;

import java.util.Scanner;

public class Deputy extends Human {
    private String name;
    private String surname;
    private int age;
    private boolean briber;
    private double sizeOfBriber;

    public Deputy(double weight, double height, String name, String surname, int age, boolean briber) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.briber = briber;
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

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public double getSizeOfBriber() {
        return sizeOfBriber;
    }

    public void setSizeOfBriber(double sizeOfBriber) {
        this.sizeOfBriber = sizeOfBriber;
    }

    public void giveBribe() {
        if (!isBriber()) {
            System.out.println("This deputy does not take bribes");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write amount of bribe:");
            double a = scanner.nextDouble();
            if (a > 5000){
                System.out.println("This deputy was caught with a bribe");
            }else {
                setSizeOfBriber(a);
            }
        }


    }

    @Override
    public String toString() {
        return "Politician{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", sizeOfBriber=" + sizeOfBriber +
                '}'+ super.toString();
    }
}
