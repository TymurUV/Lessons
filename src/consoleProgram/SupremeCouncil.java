package consoleProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SupremeCouncil {
    List<Fraction> fractionList = new ArrayList<>();
    private static SupremeCouncil instance;

    public SupremeCouncil() {
        fractionList.add(new Fraction("Potato"));
        fractionList.add(new Fraction("Tomato"));
    }

    public static SupremeCouncil getInstance() {
        if (instance == null) {
            instance = new SupremeCouncil();
        }
        return instance;
    }

    public void addFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String name = scanner.next();


        Fraction fraction = new Fraction(name);
        fractionList.add(fraction);
        System.out.println(fraction + " successfully added");
    }

    public void removeFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String name = scanner.next();
        if (isFractionExist(fractionList, name)) {
            Iterator<Fraction> iterator = fractionList.iterator();
            while (iterator.hasNext()) {
                Fraction next = iterator.next();
                if (next.getNameOfFraction().equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("Successfully removed");
                }

            }
        }
    }

    public boolean isFractionExist(List<Fraction> fractionList, String name) {
        for (Fraction f : fractionList) {
            if (f.getNameOfFraction().equalsIgnoreCase(name)) {
                return true;
            }

        }
        return false;
    }

    public void clearFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String name = scanner.next();
        if (isFractionExist(fractionList, name)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(name)) {
                    f.clearDeputies();
                }
            }
        }
    }

    public void showAllFractions() {
        for (Fraction f : fractionList) {
            System.out.println(f);
        }
    }

    public void showSpecificFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down your name of fraction");
        String name = scanner.next();
        if (isFractionExist(fractionList, name)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(name)) {
                    f.getAllDeputies();
                }
            }
        }
    }

    public void addDeputyToSpecificFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String fraction = scanner.next();
        if (isFractionExist(fractionList, fraction)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
                    f.addDeputy();
                }
            }
        }
    }


    public void removeDeputyFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String fraction = scanner.next();
        if (isFractionExist(fractionList, fraction)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
                    f.removeDeputy();
                }
            }
        }
    }

    public void showAllBribersInFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String fraction = scanner.next();
        if (isFractionExist(fractionList, fraction)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
                    f.getAllBribers();
                }
            }
        }
    }

    public void showBiggestBriberInFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down name of your fraction");
        String fraction = scanner.next();
        if (isFractionExist(fractionList, fraction)) {
            for (Fraction f : fractionList) {
                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
                    f.getBiggestBriber();
                }
            }
        }
    }

//    public void showAllDeputiesInFraction() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write down name of your fraction");
//        String fraction = scanner.next();
//        if (isFractionExist(fractionList, fraction)) {
//            for (Fraction f : fractionList) {
//                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
//                    f.getAllDeputies();
//                }
//            }
//        }
//    }
}


