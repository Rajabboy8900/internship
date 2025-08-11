import java.util.Scanner;

public class A0063 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
      int S = cin.nextInt();
      int P = cin.nextInt();


        for (int x = 1; x <= S ; x++) {
            int y = S - x;
            if (x * y == P) {

                System.out.println(Math.min(x, y)+" "+Math.max(x, y));
                 break;
            }
        }
    }
}



















