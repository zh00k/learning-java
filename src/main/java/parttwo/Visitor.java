package parttwo;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private static int totalVisitors = 0;

    public Visitor() {
        totalVisitors++;
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        List<Visitor> visitors = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            visitors.add(new Visitor());
            System.out.println("Всего посетителей: " + Visitor.getTotalVisitors());
        }

        System.out.println();

        System.out.println("Через первого: " + getTotalVisitors());
        System.out.println("Через последнего: " + getTotalVisitors());

        // Возвращает одно и то же значение, потому что поле totalVisitors
        // статичное, а значит одно на все экземпляры класса
    }
}
