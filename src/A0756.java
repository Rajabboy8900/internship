import java.util.Scanner;

public class A0756 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        int N = cin.nextInt();

        int totalEdges = M * (N - 1) + N * (M - 1);
        int mustHaveEdges = M * N - 1;

        int maxBreaks = totalEdges - mustHaveEdges;

        System.out.println(maxBreaks);
    }
}
