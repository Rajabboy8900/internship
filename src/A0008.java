    import java.util.Scanner;

    public class A0008 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);

            int A = cin.nextInt();
            int B = cin.nextInt();
            int C = cin.nextInt();

            if (A * B == C){
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
    }
