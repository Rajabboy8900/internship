import java.util.Scanner;

public class A0131 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int maxAge = -1;
        int tartibRaqami = -1;

        for (int i = 1; i <= n; i++) {
            int age = cin.nextInt();
            int gender = cin.nextInt();

            if (gender == 1) {
                if (age > maxAge) {
                    maxAge = age;
                    tartibRaqami = i;
                }
            }
        }
        System.out.println(tartibRaqami);
    }
}
