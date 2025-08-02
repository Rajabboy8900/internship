import java.util.Scanner;

public class A035 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int k = cin.nextInt();

        for (int i = 0; i < k; i++) {
        int a = cin.nextInt();
        int b = cin.nextInt();
            System.out.println(19 * b + (a + 239) * (a + 366) / 2);
        }
    }
}
