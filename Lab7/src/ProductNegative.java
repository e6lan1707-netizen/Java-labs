class ProductNegative {
    public static void main(String[] args) {
        double[] A = {-1.2, 3.5, -2.0, 4.1, -3.3, 2.2, -4.5, 1.0, -0.5, 2.5, -1.1, 3.0};
        double product = 1;
        boolean hasNegative = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }

        if (hasNegative) {
            System.out.println("Произведение отрицательных элементов: " + product);
        } else {
            System.out.println("Отрицательных элементов нет");
        }
    }
}