package parttwo;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Молоко", 69.00),
                new Product("Сыр", 399.99),
                new Product("Кола", 259.00),
                new Product("Журнал", 599.95),
                new Product("Лук", 19.90),
                new Product("Перец", 139.00)
        );

        Cart cart = new Cart();

        cart.addProduct(products.get(0), 2);
        cart.addProduct(products.get(1), 3);
        cart.addProduct(products.get(2), 10);
        cart.addProduct(products.get(3), 1);
        cart.addProduct(products.get(4), 2);
        cart.addProduct(products.get(5), 1);

        System.out.println("Всего товаров в корзине: " + cart.getProductCount());
        System.out.printf(Locale.US, "На сумму: %.2f%n", cart.getTotalPrice());
    }
}