package partone;

import java.util.List;

public class FruitList {

    private final List<String> fruits;

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

    public static void main(String[] args) {
        FruitList fruitList = new FruitList(
                List.of("Яблоко", "Банан", "Апельсин", "Киви", "Лимон")
        );
        fruitList.listAllFruits();
    }
}
