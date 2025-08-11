import java.util.Scanner;

public class A0015 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = cin.nextInt();
                if (x == 1 && j > i) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
