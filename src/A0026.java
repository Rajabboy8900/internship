import java.util.Scanner;

public class A0026 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int r1 = cin.nextInt();
        int x2 = cin.nextInt();
        int y2 = cin.nextInt();
        int r2 = cin.nextInt();

        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (result <= r1 + r2 && result + Math.min(r1, r2) >= Math.max(r1, r2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
