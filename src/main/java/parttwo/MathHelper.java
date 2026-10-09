package parttwo;

import java.util.List;

public class MathHelper {
    static int sum(int a, int b) {
        return a + b;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int min(int a, int b) {
        return a > b ? b : a;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("2 + 8 = " + MathHelper.sum(2, 8));

        List<Integer> pair = List.of(999, 990);

        System.out.println(
                MathHelper.max(pair.get(0), pair.get(1)) + " больше " + MathHelper.min(pair.get(0), pair.get(1))
        );

        int num = 9;

        if (MathHelper.isEven(num)) {
            System.out.println("Число " + num + " чётное");
        } else {
            System.out.println("Число " + num + " нечётное");
        }
    }
}
