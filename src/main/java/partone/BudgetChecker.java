package partone;

import java.util.List;
import java.util.Locale;

public class BudgetChecker {
    private final List<Double> prices;
    private final double budget;

    public BudgetChecker(List<Double> prices, double budget) {
        this.prices = prices;
        this.budget = budget;
    }

    public void check() {
        double sum = prices.stream().reduce(0d, Double::sum);
        double diff = budget - sum;

        System.out.printf(Locale.US, "Общая сумма товаров: %.2f%n", sum);

        if (diff < 0) {
            System.out.printf(Locale.US, "Бюджета не хватает. Недостаток: %.2f%n", Math.abs(diff));
        } else {
            System.out.printf(Locale.US, "Бюджета хватает. Остаток: %.2f%n", diff);
        }
    }

    public static void main(String[] args) {
        BudgetChecker budgetChecker = new BudgetChecker(
                List.of(500.00, 199.99, 665.55, 19.99, 47.13), 1000.00
        );
        budgetChecker.check();
    }
}
