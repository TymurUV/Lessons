package productHW;

import java.util.Comparator;

public class ProductSortByWidth implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getWidth(), o2.getWidth());
    }
}
