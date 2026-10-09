package partone;

import java.util.List;

public class BudgetSpender {
    List<Double> prices;
    double budget;

    public BudgetSpender(List<Double> prices, double budget) {
        this.prices = prices;
        this.budget = budget;
    }

    public void spend() {
        int i = 0;
        double spent = 0d;

        while (i < prices.size() && spent + prices.get(i) <= budget) {
            spent += prices.get(i);
            i++;
        }

        System.out.println(
                "Куплено: " + i + " товара на сумму " + spent
                + "\nОстаток бюджета: " + (budget - spent)
                + "\nНе купленно: " + (prices.size() - i) + " товара"
        );
    }
}