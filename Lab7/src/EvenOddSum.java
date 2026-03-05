public class EvenOddSum {
    public static void main(String[] args) {
        int[] D = new int[30];
        for (int i = 0; i < 30; i++) {
            D[i] = (int)(Math.random() * 100);
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int value : D) {
            if (value % 2 == 0) sumEven += value;
            else sumOdd += value;
        }

        System.out.println("Сумма четных элементов: " + sumEven);
        System.out.println("Сумма нечетных элементов: " + sumOdd);
    }
}