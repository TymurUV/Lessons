package listHw;

import java.util.ArrayList;
import java.util.List;


public class StoreInventory {
    List<Product> list = new ArrayList<>();

    public StoreInventory() {
        list.add(new Product("Apples", 3.55, 5));
        list.add(new Product("Bananas", 4.55, 4));
        list.add(new Product("Watermelon", 5.57, 1));
    }

    public void addProduct(Product product) {
        list.add(product);

    }

    public void removeInventory(int index) {
        System.out.println(list.remove(index));

    }

    public void displayInventory() {
        System.out.println(list);
    }
}
