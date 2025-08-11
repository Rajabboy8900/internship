import java.util.Scanner;

public class A0496 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int[] berries = new int[a];

        for (int i = 0; i < a; i++) {
            berries[i] = cin.nextInt();
        }
        
        int maxBerries = 0;

        for (int i = 0; i < a; i++) {
            int left = berries[(i - 1 + a) % a];
            int right = berries[(i + 1) % a];
            int own = berries[i];
            int total = left + right + own;

            if (total > maxBerries) {
            maxBerries = total;
            }
        }
        System.out.println(maxBerries);
    }
}
