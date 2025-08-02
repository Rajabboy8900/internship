    import java.util.Scanner;

    public class A0597 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);

            int r1 = cin.nextInt();
            int r2 = cin.nextInt();
            int r3 = cin.nextInt();

            if (r2 + r3 <= r1) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
