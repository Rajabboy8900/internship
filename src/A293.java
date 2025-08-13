import java.util.Scanner;

public class A293 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int[] v = new int[a];
        for (int i = 0; i < a; i++) {
            v[i] = cin.nextInt();
        }

        int[] p = new int[a];
        for (int i = 0; i < a; i++) {
            p[i] = cin.nextInt();
        }

        int bestValue = -1;
        int bestIndex = 1;

        for (int i = 0; i < a; i++) {
            int value = v[i] * p[i];
            if (value > bestValue) {
                bestValue = value;
                bestIndex = i + 1;
            }
        }
        System.out.println(bestIndex);
    }
}







