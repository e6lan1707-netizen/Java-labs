import java.util.Scanner;

public class PowerRecursive {

    public static long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень должна быть неотрицательной.");
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите основание: ");
            int base = scanner.nextInt();

            System.out.print("Введите степень: ");
            int exponent = scanner.nextInt();

            long result = power(base, exponent);
            System.out.println(base + " ^ " + exponent + " = " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}