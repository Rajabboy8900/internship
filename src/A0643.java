import java.util.Scanner;

public class A0643 {
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);

        long a = cin.nextLong();
        long b = a;
        long  count = 0;

        while (b > 0) {
            if (b % 2 == 1) {
                count++;
            }
            b = b / 2;
        }
        System.out.println(a + count);


    }
}
