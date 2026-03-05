import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] B = {5, 2, 9, 1, 6, 3, 8, 4, 7, 0, 15, 12, 14, 11, 13, 10, 17, 16, 19, 18, 21, 20, 22, 24, 23};

        Arrays.sort(B);

        System.out.println("Отсортированный массив:");
        for (int value : B) System.out.print(value + " ");
    }
}