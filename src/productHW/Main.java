package productHW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            switch (choose) {
                case "1": {
                    ProductManager productManager = new ProductManager();
                    productManager.productAdd();
                    productManager.displayProduct();
                    break;

                }
                case "2": {
                    ProductManager productManager = new ProductManager();
                    productManager.displayProduct();
                    productManager.removeProduct();
                    productManager.displayProduct();
                    break;
                }
                case "3": {
                    ProductManager productManager = new ProductManager();
                    productManager.displayProduct();
                    productManager.sortByLength();
                    productManager.displayProduct();
                    break;
                }
                case "4": {
                    ProductManager productManager = new ProductManager();
                    productManager.displayProduct();
                    productManager.sortByWidth();
                    productManager.displayProduct();
                    break;
                }
                case "5": {
                    ProductManager productManager = new ProductManager();
                    productManager.displayProduct();
                    productManager.sortByWeight();
                    productManager.displayProduct();
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
        System.out.println("-------------");
    }
}
