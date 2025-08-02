    import java.util.Scanner;

    public class A0766 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int a = cin.nextInt();
            int b  = cin.nextInt();
            int c = cin.nextInt();


            if (a * b >= c) {
                System.out.print("YES");
            }
            else System.out.print("NO");
           

        }
    }
