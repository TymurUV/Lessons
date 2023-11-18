package freestyle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    System.out.println("write your number");
                    int a = scanner.nextInt();
                    System.out.println("write your second number");
                    int b = scanner.nextInt();
                    int c = a + b;
                    System.out.println(c);
                }
                case "2": {
                    System.out.println("write your first number");
                    int a = scanner.nextInt();
                    System.out.println("write your second number");
                    int b = scanner.nextInt();
                    int c = a - b;
                    System.out.println(c);
                }
                case "3": {
                    System.out.println("write your first number");
                    int a = scanner.nextInt();
                    System.out.println("write your second number");
                    int b = scanner.nextInt();
                    int c = a * b;
                    System.out.println(c);
                    break;
                }
                case "4": {
                    System.out.println("write your first number");
                    int a = scanner.nextInt();
                    System.out.println("write your second number");
                    int b = scanner.nextInt();
                    int c = a / b;
                    if (a != 0 && b == 0) {
                            System.out.println("ERROR");
                        }else {
                        System.out.println(c);
                    }
                }
            }
            System.out.println("-------------");

            String cur = "currency";
            String bank = "ATM";

        }
    }

    public static void menu() {
        System.out.println("press 1 and Enter to use adding");
        System.out.println("press 2 and Enter to use subtraction");
        System.out.println("press 3 and Enter to use multiplication");
        System.out.println("press 4 and Enter to use division");
    }
}
