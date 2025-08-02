    import java.util.Scanner;

    public class A023 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);

            int n = cin.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    sum += i;
                }
             }
            System.out.println(sum);
        }
    }
