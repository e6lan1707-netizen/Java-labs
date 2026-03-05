public class RowNegativeSum {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 21) - 10;
            }
        }


        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) sum += A[i][j];
            }
            B[i] = sum;
        }

        System.out.println("Сумма отрицательных элементов по строкам:");
        for (int value : B) System.out.print(value + " ");
    }
}