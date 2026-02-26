public class MaxValue {

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int intResult = max(10, 25);
        double doubleResult = max(3.14, 6.28);

        System.out.println("Максимум из целых чисел: " + intResult);
        System.out.println("Максимум из вещественных чисел: " + doubleResult);
    }
}