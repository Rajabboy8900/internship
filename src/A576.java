import java.util.Scanner;

public class A576 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        if (a == 1) {
            System.out.println(0);
            return;
        }
        int count = 0;

        for (int i = 1; i <= a; i++) {
            int j;
            int limit = (int) Math.sqrt(Math.min(i, a));
            for (j = 2; j <= limit; j++) {

                if (i % j == 0) {
                    int other = i / j;
                    if (a % j == 0 || a % other == 0) {
                        break;
                    }
                }
            }

            if (j > limit) {
                if (i != 1 && a % i == 0 )continue; {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

