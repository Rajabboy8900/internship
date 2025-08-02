import java.util.Scanner;

public class A0606 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
