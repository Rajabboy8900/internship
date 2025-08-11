import java.util.Scanner;

public class A0952 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt(); // b kattalar soni
        int m = cin.nextInt(); // b kichiklar soni
        
        if (n == 0) {
            if (m == 0) {
                System.out.println(0 + " " + 0);
            } else
                System.out.println("Impossible");
        } else if (m == 0) {
            System.out.println(n + " " + n);
        } else if (m >= n) {
            System.out.println(m + " " + (n + m - 1));
        } else {
            System.out.println(n + " " + (n + m - 1));
        }
    }
}
