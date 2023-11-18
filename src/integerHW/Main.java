package integerHW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] number1 = {77, 11, 44, 3, 87, 2, 109, 1};
        Arrays.sort(number1);
        System.out.println(Arrays.toString(number1));
        Arrays.sort(number1, Comparator.reverseOrder());
        System.out.println(Arrays.toString(number1));
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    int rows = 1;
                    int cols = 10;

                    Car[][] carArray = new Car[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            carArray[i][j] = new Car(random.nextInt(300), random.nextInt(10) + 2010);
                        }
                        System.out.println(Arrays.deepToString(carArray));

                    }
                    Wheel[][] wheelArray = new Wheel[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            wheelArray[i][j] = new Wheel(random.nextInt(25), random.toString());
                        }
                        System.out.println(Arrays.deepToString(wheelArray));
                    }
                    Engine[][] engineArray = new Engine[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            engineArray[i][j] = new Engine(random.nextInt(8));

                        }
                        System.out.println(Arrays.deepToString(engineArray));

                    }
                }
                case "2": {

                    Car[] carArray = new Car[10];
                    Arrays.fill(carArray, new Car(random.nextInt(300), random.nextInt(2023)));
                    System.out.println(Arrays.deepToString(carArray));
                }


            }

        }
    }


    private static void menu() {
        System.out.println("DeepString - press 1");
        System.out.println("Fill - press 2");
    }
}
