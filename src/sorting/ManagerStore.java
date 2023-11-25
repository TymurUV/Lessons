package sorting;

import listHw.Product;

import java.util.*;

public class ManagerStore implements Comparator<Product> {
    List<Product> list = new ArrayList<>();
    @Override
    public int compare(Product o1, Product o2) {
       //return Double.compare(o1.getPrice(), o2.getPrice());
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }else {
            return 0;
        }
    }
    public void sortingByPrice(){
        list.sort(new ManagerStore());
    }
    public void addProduct(){
        list.add(new Product("Яблоко", 1.5, 15));
        list.add(new Product("Молоко", 2.0, 20));
        list.add(new Product("Хлеб", 1.0, 12));
        list.add(new Product("Картошка", 0.8, 25));
        list.add(new Product("Яйца", 1.2, 30));
        list.add(new Product("Масло", 3.5, 8));
        list.add(new Product("Сыр", 2.8, 18));
        list.add(new Product("Мясо", 5.0, 15));
        list.add(new Product("Рис", 1.2, 10));
        list.add(new Product("Вода", 0.5, 50));
    }

    public void displayProduct(){
        for (Product p : list) {
            System.out.println(p);
        }
    }
    public void removeProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product should be removed");
        String nameOfProduct = scanner.next();
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()){
            Product p1 = iterator.next();
            if (p1.getName().equalsIgnoreCase(nameOfProduct)){
                iterator.remove();
            }
        }
    }
}
