class SumNegative {
    public static void main(String[] args) {
        int[] A = {-5, 3, -2, 7, -1, 0, 4, -6, 2, -8, 9, -3, 1, -4, 6, -7, 5, -9, 8, -10};
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                sum += A[i];
            }
        }
        System.out.println("Сумма отрицательных элементов: " + sum);
    }
}