import java.util.Scanner;
public class A0312 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int A1 = cin.nextInt();
        int A2 = cin.nextInt();
        int N = cin.nextInt();

        int D = A2 - A1;
        int An = A1 + (N - 1) * D;

        System.out.println(An);

    }
}
