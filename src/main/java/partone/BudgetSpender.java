package partone;

import java.util.List;
import java.util.Locale;

public class BudgetSpender {
    private final List<Double> prices;
    private final double       budget;

    public BudgetSpender(List<Double> prices, double budget) {
        this.prices = prices;
        this.budget = budget;
    }

    public static void main(String[] args) {
        BudgetSpender budgetSpender = new BudgetSpender(
                List.of(500.00, 199.99, 665.55, 19.99, 47.13), 1000.00
        );

        budgetSpender.spend();
    }

    public void spend() {
        int    bought = 0;
        double spent  = 0d;

        while (bought < prices.size() && spent + prices.get(bought) <= budget) {
            spent += prices.get(bought);
            bought++;
        }

        System.out.printf(Locale.US, "Куплено: %d товара на сумму %.2f%n", bought, spent);
        System.out.printf(Locale.US, "Остаток бюджета: %.2f%n", budget - spent);
        System.out.printf("Не куплено: %d товара%n", prices.size() - bought);
    }
}
