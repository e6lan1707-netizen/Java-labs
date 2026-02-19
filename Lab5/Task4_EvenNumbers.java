public class Task4_EvenNumbers {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {

            if (i % 2 != 0) {
                i++;
                continue;
            }

            System.out.print(i + " ");
            i++;
        }
    }
}