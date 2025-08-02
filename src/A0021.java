import java.util.Scanner;

public class A0021 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        int max = Math.max(a, (Math.max(b, c)));
        int min = Math.min(a, (Math.min(b, c)));
         System.out.print(max - min);
    }
}