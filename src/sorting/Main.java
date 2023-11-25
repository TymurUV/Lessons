package sorting;

public class Main {
    public static void main(String[] args) {
        ManagerStore managerStore = new ManagerStore();
        managerStore.addProduct();
        System.out.println("-----------------");
        managerStore.displayProduct();
        System.out.println("-----------------");
        managerStore.sortingByPrice();
        System.out.println("-----------------");
        managerStore.displayProduct();
        managerStore.removeProduct();
        System.out.println("-----------------");
        managerStore.displayProduct();
    }
}
