package parttwo;

public class Visitor {
    public static int getTotalVisitors() {
        return totalVisitors;
    }

    private static int totalVisitors = 0;

    public Visitor() {
        totalVisitors++;
    }
}
