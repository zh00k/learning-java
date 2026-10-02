static class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduce() {
        System.out.println(
            "Привет, меня зовут "
            + firstName + " " + lastName + "."
            + " Мне " + age + " лет."
        );
    }
}

static class FruitList {

    List<String> fruits;

    public FruitList(List<String> fruits) {
        this.fruits = fruits;
    }

    public void listAllFruits() {
        if (fruits.isEmpty()) {
            System.out.println("Список фруктов пуст");
        }

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }
    }
}

static class BudgetChecker {
    List<Double> prices;
    double budget;

    BudgetChecker(List<Double> prices, double budget) {
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

static class BudgetSpender {
    List<Double> prices;
    double budget;

    BudgetSpender(List<Double> prices, double budget) {
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

void main() {
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