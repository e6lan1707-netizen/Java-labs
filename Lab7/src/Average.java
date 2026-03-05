public class Average {
    public static void main(String[] args) {
        double[] D = {1.0, 2.5, 3.7, 4.0, 5.2, 6.3, 7.1, 8.6, 9.0, 10.5, 11.1, 12.3, 13.4, 14.2, 15.0, 16.7, 17.8};
        double sum = 0;
        for (double value : D) {
            sum += value;
        }
        double average = sum / D.length;
        System.out.println("Среднее арифметическое элементов: " + average);
    }
}