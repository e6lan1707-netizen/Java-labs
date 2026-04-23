import java.util.Scanner;
import java.util.Random;

public class DoWhileLab14 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Числа от 1 до 10");
            System.out.println("2. Ввод положительного числа");
            System.out.println("3. Сумма цифр");
            System.out.println("4. Проверка пароля");
            System.out.println("5. Факториал");
            System.out.println("6. Continue/Stop");
            System.out.println("7. Сумма двух чисел");
            System.out.println("8. Сумма четных чисел до 100");
            System.out.println("9. Сумма от 1 до N");
            System.out.println("10. Количество цифр");
            System.out.println("11. Таблица умножения");
            System.out.println("12. Максимальная цифра");
            System.out.println("13. Палиндром");
            System.out.println("14. Четные цифры");
            System.out.println("15. Рандом до 0");
            System.out.println("16. Сумма до 0");
            System.out.println("17. Пароль >= 6 символов");
            System.out.println("18. Минимальное число");
            System.out.println("0. Выход");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: numbers1to10(); break;
                case 2: positiveNumber(); break;
                case 3: sumOfDigits(); break;
                case 4: passwordCheck(); break;
                case 5: factorial(); break;
                case 6: continueOrStop(); break;
                case 7: sumTwoNumbers(); break;
                case 8: evenNumbersSum(); break;
                case 9: sumToN(); break;
                case 10: countDigits(); break;
                case 11: multiplicationTable(); break;
                case 12: maxDigit(); break;
                case 13: palindrome(); break;
                case 14: evenDigitCount(); break;
                case 15: randomUntilZero(); break;
                case 16: sumUntilZero(); break;
                case 17: passwordLengthCheck(); break;
                case 18: minNumber(); break;
            }

        } while (choice != 0);

        System.out.println("Программа завершена.");
    }

    static void numbers1to10() {
        int i = 1;
        do {
            System.out.println(i++);
        } while (i <= 10);
    }

    static void positiveNumber() {
        int num;
        do {
            System.out.print("Введите положительное число: ");
            num = scanner.nextInt();
        } while (num <= 0);
    }

    static void sumOfDigits() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("Сумма: " + sum);
    }

    static void passwordCheck() {
        String correct = "12345";
        String input;
        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(correct));
        System.out.println("Доступ разрешён!");
    }

    static void factorial() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int fact = 1, i = 1;
        do {
            fact *= i++;
        } while (i <= n);
        System.out.println("Факториал: " + fact);
    }

    static void continueOrStop() {
        String choice;
        do {
            System.out.println("Работаем...");
            System.out.print("Продолжить? ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    static void sumTwoNumbers() {
        String choice;
        do {
            System.out.print("a: ");
            int a = scanner.nextInt();
            System.out.print("b: ");
            int b = scanner.nextInt();
            System.out.println("Сумма: " + (a + b));
            scanner.nextLine();
            System.out.print("Еще? ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    static void evenNumbersSum() {
        int sum = 0, i = 2;
        do {
            sum += i;
            i += 2;
        } while (i <= 100);
        System.out.println("Сумма: " + sum);
    }

    static void sumToN() {
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = 0, i = 1;
        do {
            sum += i++;
        } while (i <= n);
        System.out.println("Сумма: " + sum);
    }

    static void countDigits() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int count = 0;
        do {
            n /= 10;
            count++;
        } while (n > 0);
        System.out.println("Цифр: " + count);
    }

    static void multiplicationTable() {
        System.out.print("Число: ");
        int n = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }

    static void maxDigit() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int max = 0;
        do {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        } while (n > 0);
        System.out.println("Макс цифра: " + max);
    }

    static void palindrome() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int original = n, reversed = 0;

        do {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        } while (n > 0);

        System.out.println(original == reversed ? "Палиндром" : "Не палиндром");
    }

    static void evenDigitCount() {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int count = 0;

        do {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        } while (n > 0);

        System.out.println("Четных цифр: " + count);
    }

    static void randomUntilZero() {
        int num;
        do {
            num = random.nextInt(10);
            System.out.println(num);
        } while (num != 0);
    }

    static void sumUntilZero() {
        int sum = 0, num;
        do {
            System.out.print("Введите число (0 для выхода): ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Сумма: " + sum);
    }

    static void passwordLengthCheck() {
        String pass;
        do {
            System.out.print("Введите пароль: ");
            pass = scanner.nextLine();
        } while (pass.length() < 6);
        System.out.println("Ок");
    }

    static void minNumber() {
        int num, min = Integer.MAX_VALUE;
        do {
            System.out.print("Введите число (0 для выхода): ");
            num = scanner.nextInt();
            if (num != 0 && num < min) min = num;
        } while (num != 0);

        System.out.println("Минимум: " + min);
    }
}
