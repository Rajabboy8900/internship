import java.util.Scanner;

public class A0106 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

              int N = cin.nextInt();

                int som = 0; // 1 so'm
                int gerb = 0; // 0  gerb

                for (int i = 0; i < N; i++) {
                    int coin = cin.nextInt();
                    if (coin == 1) som++;
                    else gerb++;
                }

                // kamini ag'daramiz
                System.out.println(Math.min(som, gerb));
            }
        }


