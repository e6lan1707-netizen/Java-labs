import java.util.Scanner;

public class Task2_SumWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Сумма = " + sum);
    }
}