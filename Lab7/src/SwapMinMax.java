public class SwapMinMax {
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 9, 7, 2, 8, 6, 4, 0, 12, 14, 11, 13, 15, 17, 16, 10, 18, 19, 20, 21, 22, 23, 24};

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("Массив после обмена минимального и максимального элементов:");
        for (int value : A) System.out.print(value + " ");
    }
}