import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lab13 {

    static Scanner sc = new Scanner(System.in);

    static List<Integer> numbers = Arrays.asList(5, 12, 7, 3, 12, 8, 20, 3);
    static List<String> strings = Arrays.asList("java", "stream", "lambda", "code", "rock", "metal");

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return String.format("%-10s | Age: %-3d | Grade: %.1f", name, age, grade);
        }
    }

    static List<Student> students = Arrays.asList(
            new Student("Alex", 20, 85),
            new Student("Bob", 22, 75),
            new Student("Charlie", 20, 90),
            new Student("Dave", 23, 60)
    );

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = sc.nextInt();

            System.out.println("\n================ RESULT ================\n");

            switch (choice) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
                case 10 -> task10();
                case 11 -> task11();
                case 12 -> task12();
                case 13 -> task13();
                case 14 -> task14();
                case 15 -> task15();
                case 16 -> task16();
                case 17 -> task17();
                case 18 -> task18();
                case 19 -> task19();
                case 20 -> task20();
                case 0 -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Ошибка выбора");
            }

            System.out.println("\n========================================\n");
        }
    }

    static void printMenu() {
        System.out.println("""
        ========= Лабораторная №13 (Stream API) =========
        1  - Сложение
        2  - UpperCase
        3  - Нечетные числа
        4  - Квадраты
        5  - Максимум
        6  - Сортировка строк
        7  - Заглавная буква
        8  - Длина > 5
        9  - Method Reference
        10 - Optional (min)
        11 - Consumer
        12 - Supplier
        13 - Сортировка студентов
        14 - Студенты > 80
        15 - Chain
        16 - Grouping
        17 - Reduce (sum)
        18 - Distinct + Limit
        19 - FlatMap
        20 - Orders
        0  - Выход
        ========================================
        Выбор:
        """);
    }

    static void task1() {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("5 + 3 = " + sum.apply(5, 3));
    }

    static void task2() {
        Function<String, String> f = String::toUpperCase;
        System.out.println(f.apply("hello world"));
    }

    static void task3() {
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }

    static void task4() {
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }

    static void task5() {
        System.out.println(numbers.stream().max(Integer::compare).orElse(0));
    }

    static void task6() {
        strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

    static void task7() {
        strings.stream()
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .forEach(System.out::println);
    }

    static void task8() {
        strings.stream().filter(s -> s.length() > 5).forEach(System.out::println);
    }

    static void task9() {
        numbers.forEach(System.out::println);
    }

    static void task10() {
        System.out.println(numbers.stream().min(Integer::compare).orElse(0));
    }

    static void task11() {
        Consumer<String> c = System.out::println;
        c.accept("Hello from Consumer");
    }

    static void task12() {
        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println(s.get());
    }

    static void task13() {
        students.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(System.out::println);
    }

    static void task14() {
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }

    static void task15() {
        numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }

    static void task16() {
        System.out.println(
                students.stream().collect(Collectors.groupingBy(s -> s.age))
        );
    }

    static void task17() {
        System.out.println(numbers.stream().reduce(0, Integer::sum));
    }

    static void task18() {
        numbers.stream().distinct().limit(3).forEach(System.out::println);
    }

    static void task19() {
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        nested.stream().flatMap(List::stream).forEach(System.out::println);
    }

    static void task20() {
        List<Integer> orders = Arrays.asList(500,1500,700,2000,1200);

        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}