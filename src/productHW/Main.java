package productHW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    productManager.productAdd();
                    break;

                }
                case "2": {
                    productManager.removeProduct();

                    break;
                }
                case "3": {
                    productManager.sortByLength();
                    break;
                }
                case "4": {
                    productManager.sortByWidth();
                    break;
                }
                case "5": {
                    productManager.sortByWeight();
                    break;
                }
                case "6": {
                    productManager.displayProduct();
                    break;
                }
            }
        }

    }

    private static void menu() {
        System.out.println("-------------");
        System.out.println("Press 1 to add product");
        System.out.println("Press 2 to remove product");
        System.out.println("Press 3 to sort by length");
        System.out.println("Press 4 to sort by width");
        System.out.println("Press 5 to sort by weight");
        System.out.println("Press 6 to display");
        System.out.println("-------------");
    }
}
