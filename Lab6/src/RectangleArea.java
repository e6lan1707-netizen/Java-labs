import java.util.Scanner;

public class RectangleArea {

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Ширина и высота должны быть положительными числами.");
            return -1;
        }
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);

        if (area != -1) {
            System.out.println("Площадь прямоугольника: " + area);
        }

        scanner.close();
    }
}