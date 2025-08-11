import java.util.Scanner;

public class A0014 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a1 = cin.nextInt();
        int b1 = cin.nextInt();
       int max = Math.max(a1, b1);
       int min = Math.min(a1, b1);
       int ekub = 0;
        while (min > 0){
            ekub = max % min;
            max = min;
            min = ekub;

        }
        System.out.println((a1 * b1) / max);
    }
}
