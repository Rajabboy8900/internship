import java.util.Scanner;

public class A0949 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int an = cin.nextInt();
        int an1 = cin.nextInt();

        int[] fib = new int[n + 2];
        fib[n] = an;
        fib[n + 1] = an1;

        for (int i = n - 1; i >= 1; i--) {
            fib[i] = fib[i + 2] - fib[i + 1];
        }
        System.out.println(fib[1] + " " + fib[2]);
    }
}
