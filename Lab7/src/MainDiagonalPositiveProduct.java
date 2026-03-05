public class MainDiagonalPositiveProduct {
    public static void main(String[] args) {
        int[][] C = new int[5][5];

        // Заполняем случайными числами от -10 до 10
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int)(Math.random() * 21) - 10;
            }
        }

        int product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }

        if (hasPositive) {
            System.out.println("Произведение положительных элементов главной диагонали: " + product);
        } else {
            System.out.println("Положительных элементов на диагонали нет");
        }
    }
}