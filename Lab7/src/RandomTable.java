public class RandomTable {
    public static void main(String[] args) {
        int[][] table = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (int)(Math.random() * 10);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}