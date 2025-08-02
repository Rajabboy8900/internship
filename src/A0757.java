import java.util.Scanner;

public class A0757 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long C = cin.nextLong();
        long H = cin.nextLong();
        long O = cin.nextLong();

        long maxC = C / 2;
        long maxH = H / 6;
        long maxO = O / 1;

        long answer = Math.min(maxC, Math.min(maxH, maxO));

        System.out.println(answer);
    }
}
