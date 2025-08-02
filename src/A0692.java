import java.util.Scanner;

public class A0692 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();

                if (N > 0 && (N & (N - 1)) == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
    }
}
