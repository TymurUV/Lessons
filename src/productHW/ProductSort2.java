package productHW;

import java.util.Comparator;
import java.util.TreeSet;

public class ProductSort2 implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getWidth(), o2.getWidth());
    }
}
