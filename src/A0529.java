import java.util.Scanner;

public class A0529 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int x2 = cin.nextInt();
        int y2 = cin.nextInt();

        int dx = x2 - x1;
        int dy = y2 - y1;

        double result = Math.sqrt(Math.pow(dx, 2)+ Math.pow(dy, 2));

        System.out.println(result);
    }
}
