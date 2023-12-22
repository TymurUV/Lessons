package productHW;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private double length;
    private double width;
    private double weight;

    public Product(double length, double width, double weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
