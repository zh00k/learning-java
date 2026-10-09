package parttwo;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        products.merge(product, quantity, Integer::sum);
    }

    public double getTotalPrice() {
        double sum = 0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }

        return sum;
    }

    public int getProductCount() {
        int count = 0;

        for (int quantity : products.values()) {
            count += quantity;
        }

        return count;
    }
}
