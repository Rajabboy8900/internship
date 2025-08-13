import java.util.Arrays;
import java.util.Scanner;

public class A0642 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int N = cin.nextInt();
        int S = cin.nextInt();

        long[] a = new  long[N];
        for (int i = 0; i < N; i++) {
           a[i] = cin.nextLong();
        }
        Arrays.sort(a);
          
        int count = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (sum + a[i] <= S) {
                sum += a[i];
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
