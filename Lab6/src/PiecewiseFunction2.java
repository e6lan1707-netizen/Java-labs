public class PiecewiseFunction2 {

    public static void main(String[] args) {

        double x = 4;
        double y;

        if (x < 1) {
            y = 1;
        } else if (x <= 5) {
            y = x * 2;
        } else {
            y = x * x;
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}