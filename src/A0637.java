//
import java.util.Scanner;

public class A0637 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int total = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = cin.nextInt();
        int k = cin.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] <= k) total += a[i];
            else total += k;
        }

        System.out.println(total);
    }
}