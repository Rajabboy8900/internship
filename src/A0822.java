import java.util.Scanner;

public class A0822 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double x1 = cin.nextInt();
        double y1 = cin.nextInt();
        double x2 = cin.nextInt();
        double y2 = cin.nextInt();
        double x3 = cin.nextInt();
        double y3 = cin.nextInt();

      double yuzi = 0.5 * Math.abs(
           x1 * (y3 - y2) +
            x2 * (y1 - y3) +
            x3 * (y2 - y1)
        );

        System.out.println(yuzi);

    }
}













