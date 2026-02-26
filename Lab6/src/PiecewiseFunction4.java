public class PiecewiseFunction4 {

    public static void main(String[] args) {

        double x = 12;
        double y;

        if (x >= 0) {
            if (x <= 10) {
                y = x * x;
            } else {
                y = x + 10;
            }
        } else {
            y = -x;
        } 

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}