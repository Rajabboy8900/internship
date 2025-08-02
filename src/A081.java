import java.util.Scanner;

public class A081 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);


        int n = cin.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int b = cin.nextInt();
            if (b < min) min = b;
            if (b > max) max = b;
        }
        System.out.println(min + " " + max);


    }
}
