import java.util.Scanner;

public class A0844 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long  a = cin.nextLong();
        long  b = cin.nextLong();

        double c = Math.sqrt(a * b);
        if (c % 1 == 0) {
            System.out.print((int) c);
        } else {
            System.out.println(0);
        }
    }
}
