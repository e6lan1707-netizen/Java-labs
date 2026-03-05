public class MainDiagonalAverage {
    public static void main(String[] args) {
        int[][] D = new int[7][7];

        // Заполняем случайными числами от 0 до 20
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = (int)(Math.random() * 21);
            }
        }

        int sum = 0;
        for (int i = 0; i < 7; i++) sum += D[i][i];

        double average = sum / 7.0;
        System.out.println("Среднее арифметическое главной диагонали: " + average);
    }
}