import java.util.Scanner;

public class A0697 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int L = cin.nextInt();
        int W = cin.nextInt();
        int H = cin.nextInt();

        int result = 2 * (L * H + W * H);
        int  min = (result + 15) / 16;
        System.out.println(min);
    }
}
