import java.util.Scanner;

public class A0022 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int count = 0;

        while (a > 0) {
            if (a % 2 == 1) {
                count++;
            }
            a = a / 2;
        }
        System.out.println(count);
    }
}
