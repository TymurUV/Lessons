package listHw;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StoreInventory storeInventory = new StoreInventory();
        storeInventory.displayInventory("Apples");
        storeInventory.addProduct(new Product("Oranges", 2.33, 7));
        storeInventory.displayInventory("Oranges");
        storeInventory.removeInventory(0);
        storeInventory.displayInventory("Banana");








    }

}
