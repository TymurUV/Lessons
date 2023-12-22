package productHW;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
                    Set<ProductSort> productSorts = new TreeSet<>(new Comparator<ProductSort>() {
                        @Override
                        public int compare(ProductSort o1, ProductSort o2) {
                            return 0;
                        }
                    });
                    break;
                }
                case "4": {
                }
                case "5": {
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
