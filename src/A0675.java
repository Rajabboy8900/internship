import java.util.Scanner;

public class A0675 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        int mingap = M;

        cin.nextLine();

        for (int i = 0; i < N; i++) {
            String row = cin.nextLine();

            int first = -1;
            int second = 0;

            for (int j = 0; j < M; j++) {
                char a = row.charAt(j);

                if (a == 'A') {
                    first = j;
                } else if (a == 'B') {
                    second = j;
                    break;
                }
            }
            int bosh = second - first - 1;
            if (bosh < mingap) {
                mingap = bosh;
            }
        }
        System.out.println(mingap);

    }
}
