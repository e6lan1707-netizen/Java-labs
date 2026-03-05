public class ArrayAverage {
    public static void main(String[] args) {
        double[] C = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double sum = 0;
        for (double value : C) sum += value;
        double average = sum / C.length;
        System.out.println("Среднее значение массива: " + average);
    }
}