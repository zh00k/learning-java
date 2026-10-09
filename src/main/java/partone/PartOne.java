package partone;

import java.util.List;

public class PartOne {

    public static void run() {
        // Задание №1
        System.out.println("---\nЗадание №1\n");
        Person person = new Person("Igor", "Syn'ak", 67);
        person.introduce();

        // Задание №2
        System.out.println("\n---\nЗадание №2\n");
        FruitList fruitList = new FruitList(
                List.of("Яблоко", "Банан", "Апельсин", "Киви", "Лемон")
        );
        fruitList.listAllFruits();

        // Задание №3
        System.out.println("\n---\nЗадание №3\n");
        BudgetChecker budgetChecker = new BudgetChecker(
                List.of(500.00, 199.99, 665.55, 19.99, 47.13), 1000.00
        );
        budgetChecker.check();

        // Задание №4
        System.out.println("\n---\nЗадание №4\n");
        BudgetSpender budgetSpender = new BudgetSpender(
                List.of(500.00, 199.99, 665.55, 19.99, 47.13), 1000.00
        );
        budgetSpender.spend();
    }
}