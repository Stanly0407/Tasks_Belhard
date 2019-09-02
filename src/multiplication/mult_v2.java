package multiplication;

public class mult_v2 {
    public static void main(String[] args) {

        int[] multip1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] multip2 = {1, 2, 3, 4, 5,6, 7, 8, 9};
        for (int i = 0; i < multip1.length; i++) {
            for (int j = 0; j < multip2.length; j++) {
                System.out.printf("%5d", multip1[i] * multip2[j]);
            }
            System.out.println();
        }
    }
}
