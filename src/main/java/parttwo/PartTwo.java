package parttwo;

import java.util.List;
import java.util.Map;

public class PartTwo {

    public static void run() {
        // Задание №1
        System.out.println("---\nЗадание №1\n");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwnerName("Валерий Альбертович");
        System.out.println("Владелец аккаунта: " + bankAccount.getOwnerName());
        bankAccount.setBalance(1000);
        System.out.println("Баланс: " + bankAccount.getBalance());
        bankAccount.setBalance(-500);
        System.out.println("Новый баланс: " + bankAccount.getBalance());


        // Задание №2
        System.out.println("\n---\nЗадание №2\n");
        System.out.println("Я уже в первом задании сделал создание через конструктор...\n");

        List<Person> persons = List.of(
                new Person("Aboba", "Birobijan", 68),
                new Person("Vitaly", "Zalupkin", 77),
                new Person("Valery", "Zhmishenko", 74)
        );

        persons.forEach(Person::introduce);


        // Задание №3
        System.out.println("\n---\nЗадание №3\n");
        System.out.println("2 + 8 = " + MathHelper.sum(2, 8));

        List<Integer> pair = List.of(999, 990);

        System.out.println(MathHelper.max(pair.get(0), pair.get(1)) + " больше " + MathHelper.min(pair.get(0), pair.get(1)));

        int num = 9;

        if (MathHelper.isEven(num)) {
            System.out.println("Число " + String.valueOf(num) + " чётное");
        } else {
            System.out.println("Число " + String.valueOf(num) + " нечётное");
        };


        // Задание №4
        System.out.println("\n---\nЗадание №4\n");

        // т.к. поле статичное, а значит одно на все экземпляры класса
        for (int i = 0; i < 5; i++) {
            new Visitor();
            System.out.println("Посетитель создан...");
            System.out.println("Всего посетителей: " + Visitor.getTotalVisitors());
        }


        // Задание №5
        System.out.println("\n---\nЗадание №5\n");
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
        System.out.println("На сумму: " + cart.getTotalPrice());
    }
}
