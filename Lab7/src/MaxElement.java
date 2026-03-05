public class MaxElement {
    public static int maxX(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) max = value;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] D = {5, 3, 8, 1, 9, 2, 7};
        System.out.println("Максимальный элемент: " + maxX(D));
    }
}