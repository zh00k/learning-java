package parttwo;

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
}
