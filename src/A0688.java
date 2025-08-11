import java.util.Scanner;

public class A0688 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int gx = cin.nextInt();

        int gy = cin.nextInt();
        int dx = cin.nextInt();
        int dy = cin.nextInt();

        int a = cin.nextInt();

        for (int i = 1; i <= a; i++) {
            int ax = cin.nextInt();
            int ay = cin.nextInt();

            double gofer = Math.sqrt((ax - gx) * (ax - gx) + (ay - gy) * (ay - gy));
            double it = Math.sqrt((ax - dx) * (ax - dx) + (ay - dy) * (ay - dy));

            if (gofer * 2 <= it) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("NO");

    }
}



