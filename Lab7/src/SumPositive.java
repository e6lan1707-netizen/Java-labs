class SumPositive {
    public static void main(String[] args) {
        int[] B = {1, -3, 4, -2, 5, -1, 6, -4, 7, -5, 8, -6, 9, -7, 10};
        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > 0) {
                sum += B[i];
            }
        }
        System.out.println("Сумма положительных элементов: " + sum);
    }
}