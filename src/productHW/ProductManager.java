package productHW;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {
    Set<Product> set = new TreeSet<>(new ProductSortDefault());

    public void sortByLength() {
        Set<Product> set = new TreeSet<>(new ProductSortByLength());
        set.addAll(set);
        for (Product p : set) {
            System.out.println(p);
        }
    }

    public void sortByWidth() {
        Set<Product> set = new TreeSet<>(new ProductSortByWidth());
        set.addAll(set);
        for (Product p : set) {
            System.out.println(p);
        }
    }

    public void sortByWeight() {
        Set<Product> set = new TreeSet<>(new ProductSortByWeight());
        set.addAll(set);
        for (Product p : set) {
            System.out.println(p);
        }
    }

    public void productAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write length of your product");
        double length = scanner.nextDouble();
        System.out.println("Write width of your product");
        double width = scanner.nextDouble();
        System.out.println("Write weight of your product");
        double weight = scanner.nextDouble();
        Product product = new Product(length, width, weight);
        set.add(product);
    }

    public void displayProduct() {
        for (Product p : set) {
            System.out.println(p);
        }
    }

    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your products length");
        double length = scanner.nextDouble();
        System.out.println("Write your products width");
        double width = scanner.nextDouble();
        System.out.println("Write your products weight");
        double weight = scanner.nextDouble();
        if (isProductExist(set, length, width, weight)) {
            Iterator<Product> iterator = set.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getLength() == length && product.getWidth() == width && product.getWeight() == weight) {
                    iterator.remove();
                    System.out.println("Your product has been removed");
                }
            }
        }
    }

    public boolean isProductExist(Set<Product> products, double length, double width, double weight) {
        for (Product p : products) {
            if (p.getLength() == length) {
                return true;
            }
        }
        return false;
    }

}
