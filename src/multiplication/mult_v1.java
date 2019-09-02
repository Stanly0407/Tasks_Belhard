package multiplication;

public class mult_v1 {
    public static void main(String[] args) {

        int[][] multip = new int[9][9];

        for (int i = 0; i < multip.length; i++) {
            for (int j = 0; j < multip.length; j++) {
                multip[i][j] = (i + 1) * (j + 1);
                System.out.print(multip[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
