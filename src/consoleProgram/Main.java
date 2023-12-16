package consoleProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    SupremeCouncil.getInstance().addFraction();
                    break;
                }
                case "2": {
                    SupremeCouncil.getInstance().removeFraction();
                    break;
                }
                case "3": {
                    SupremeCouncil.getInstance().showAllFractions();
                    break;
                }
                case "4": {
                    SupremeCouncil.getInstance().clearFraction();
                    break;
                }
                case "5": {
                    SupremeCouncil.getInstance().showSpecificFraction();
                    break;
                }
                case "6": {
                    SupremeCouncil.getInstance().addDeputyToSpecificFraction();
                    break;
                }
                case "7": {
                    SupremeCouncil.getInstance().removeDeputyFromFraction();
                    break;
                }
                case "8": {
                    SupremeCouncil.getInstance().showAllBribersInFraction();
                    break;
                }
                case "9": {
                    SupremeCouncil.getInstance().showBiggestBriberInFraction();
                    break;
                }
            }
        }
    }

    private static void menu() {
        System.out.println("---------------");
        System.out.println("Press 1 to add fraction to supreme council");
        System.out.println("Press 2 to remove specific fraction from Supreme Council");
        System.out.println("Press 3 to show all fractions in Supreme council");
        System.out.println("Press 4 to clear specific fraction");
        System.out.println("Press 5 to show specific fraction");
        System.out.println("Press 6 to add Deputy to specific fraction");
        System.out.println("Press 7 to remove Deputy from specific fraction");
        System.out.println("Press 8 to show list of bribers in specific fraction");
        System.out.println("Press 9 to show the biggest briber");
        System.out.println("---------------");
    }
}
