package zooClub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    zooClub.addPerson();

                    break;
                }
                case "2": {
                    zooClub.addPetToPerson();
                    break;
                }
                case "3": {
                    zooClub.removePetFromPerson();
                    break;


                }
                case "4": {
                    zooClub.removePerson();
                    break;
                }
                case "5": {
                    zooClub.removeCertainAnimalFromAllPerson();
                    break;
                }
                case "6": {
                    zooClub.getZooClub();
                    break;
                }
                case "7": {
                    zooClub.getExit();
                    break;
                }
            }
        }
    }


    private static void menu() {
        System.out.println("-------------");
        System.out.println("Press 1 to add club member");
        System.out.println("Press 2 to add pet to a club member");
        System.out.println("Press 3 to remove pet from a club member");
        System.out.println("Press 4 to remove club member from a club");
        System.out.println("Press 5 to remove specific pet from every club member");
        System.out.println("Press 6 to show zoo club");
        System.out.println("Press 7 to exit");
        System.out.println("-------------");
    }
}
