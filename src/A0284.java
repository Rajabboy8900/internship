import java.util.Scanner;

public class A0284 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = cin.nextInt();
        }
        int m = cin.nextInt();
        for (int j = 0; j < m; j++) {
            int i = cin.nextInt();
            int q = cin.nextInt();
            for (int k = i - 1; k < q; k++) {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();

    }
}
