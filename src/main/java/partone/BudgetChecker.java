package partone;

import java.util.List;

public class BudgetChecker {
    List<Double> prices;
    double budget;

    public BudgetChecker(List<Double> prices, double budget) {
        this.prices = prices;
        this.budget = budget;
    }

    public void check() {
        Double sum = prices.stream().reduce(0d, Double::sum);
        double diff = budget - sum;

        if (diff < 0) {
            System.out.println("Нехватает: " + Math.abs(diff));
        } else {
            System.out.println("Осталось: " + diff);
        }
    }
}