public class PiecewiseFunction1 {

    public static void main(String[] args) {

        double x = -3;   // ← меняй значение тут
        double y;

        if (x < 0) {
            y = x * x;
        } else {
            y = x + 5;
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}