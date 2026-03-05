public class ColumnNegativeProduct {
    public static void main(String[] args) {
        int[][] A = new int[12][6];
        int[] product = new int[6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = (int)(Math.random() * 11) - 5;
            }
        }

        for (int j = 0; j < 6; j++) {
            int prod = 1;
            boolean hasNegative = false;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    prod *= A[i][j];
                    hasNegative = true;
                }
            }
            product[j] = hasNegative ? prod : 0;
        }

        System.out.println("Произведение отрицательных элементов по столбцам:");
        for (int value : product) System.out.print(value + " ");
    }
}