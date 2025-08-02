import java.util.Scanner;

public class A0233 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int busHeight = 437;

        for (int i = 1; i <= n; i++) {
            int bridge = cin.nextInt();
            if (bridge <= busHeight) {
                System.out.println("Crash " + i);
                return;
            }
        }
        System.out.println("No crash");
    }
}
