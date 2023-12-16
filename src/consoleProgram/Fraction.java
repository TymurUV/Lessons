package consoleProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
    List<Deputy> deputyList = new ArrayList<>();
    private String nameOfFraction;

    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public List<Deputy> getDeputyList() {
        return deputyList;
    }

    public void setDeputyList(List<Deputy> deputyList) {
        this.deputyList = deputyList;
    }

    public String getNameOfFraction() {
        return nameOfFraction;
    }

    public void setNameOfFraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    @Override
    public String toString() {
        return "Name of Fraction:" + nameOfFraction;
    }

    public void addDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down deputy name");
        String name = scanner.next();
        System.out.println("Write down deputy surname");
        String surname = scanner.next();
        System.out.println("Write down age");
        int age = scanner.nextInt();
        System.out.println("Write down height");
        double height = scanner.nextDouble();
        System.out.println("Write down weight");
        double weight = scanner.nextDouble();
        System.out.println("Is your deputy briber(true or false)");
        Boolean bribe = scanner.nextBoolean();

        Deputy deputy = new Deputy(weight, height, name, surname, age, bribe);
        if (deputy.isBriber()) {
            deputy.giveBribe();
        }
        deputyList.add(deputy);
        System.out.println(deputy + " successfully added");


    }

    public void removeDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name");
        String name = scanner.next();
        System.out.println("Write down surname");
        String surname = scanner.next();
        if (isDeputyExist(deputyList, name, surname)) {
            Iterator<Deputy> iterator = deputyList.iterator();
            while (iterator.hasNext()) {
                Deputy deputy1 = iterator.next();
                if (deputy1.getSurname().equalsIgnoreCase(surname) && deputy1.getName().equalsIgnoreCase(name)) {
                    iterator.remove();
                }
            }
        }
    }

    public void getAllBribers() {
        for (Deputy d : deputyList) {
            if (d.isBriber()) {
                System.out.println(d);
            }
        }
    }

    public void getBiggestBriber() {
        double biggestBribe = 0;
        Deputy deputy = null;
        for (Deputy d : deputyList) {
            if (d.getSizeOfBriber() > biggestBribe) {
                biggestBribe = d.getSizeOfBriber();
                deputy = d;
            }
        }
        if (deputy != null) {
            System.out.println(deputy);
        } else {
            System.out.println("There is no such deputy");
        }
    }

    public void getAllDeputies() {
        for (Deputy d : deputyList) {
            System.out.println(d);
        }
    }

    public void clearDeputies() {
        deputyList.clear();
        System.out.println("Your fraction was fully cleaned");
    }

    public boolean isDeputyExist(List<Deputy> deputyList, String nameOfDeputy, String surnameOfDeputy) {
        for (Deputy d : deputyList) {
            if (d.getName().equalsIgnoreCase(nameOfDeputy) &&
                    d.getSurname().equalsIgnoreCase(surnameOfDeputy)) {
                return true;
            }
        }
        return false;
    }
//    public boolean isDeputyBriber(List<Deputy> deputyList) {
//        for (Deputy d: deputyList) {
//            if (d.isBriber()){
//                return true;
//            }
//        }
//        return false;
//    }
}
