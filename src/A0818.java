import java.util.Scanner;

public class A0818 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

         int A = cin.nextInt();
         int sum = 0;

        for (int i = 0; i < A; i++) {
            int b = cin.nextInt();
            sum += b;
        }

         int result = sum - (A - 1);

        System.out.println(result);
    }
}
