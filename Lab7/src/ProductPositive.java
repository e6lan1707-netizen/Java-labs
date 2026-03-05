class ProductPositive {
    public static void main(String[] args) {
        double[] C = {1.1, -2.2, 3.3, -4.4, 5.5, 6.6, -7.7, 8.8, -9.9, 10.0,
                2.2, -1.1, 4.4, -3.3, 5.5, -2.2, 6.6, -4.4, 7.7, -5.5,
                8.8, -6.6, 9.9, -7.7, 10.0};
        double product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < C.length; i++) {
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }

        if (hasPositive) {
            System.out.println("Произведение положительных элементов: " + product);
        } else {
            System.out.println("Положительных элементов нет");
        }
    }
}