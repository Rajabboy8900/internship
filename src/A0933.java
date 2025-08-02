import java.util.Scanner;

public class A0933 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int A = cin.nextInt();
        int B = cin.nextInt();
        int C = cin.nextInt();
        int T = cin.nextInt();


        int narxi;

        if (T <= A) {
            narxi = T * B;
        }else{
            narxi = A * B + (T - A) * C;
        }
        System.out.println(narxi);
    }
}
