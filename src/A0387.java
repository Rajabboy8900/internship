import java.util.Scanner;

public class A0387 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A = Integer.parseInt(cin.nextLine());
        int count = 0;

        for (int i = 0; i < A; i++) {
            String rule = cin.nextLine();

            int belgi = 0;
            for (int j = 0; j < rule.length() - 1; j++) {
                if (rule.charAt(j) == '-' && rule.charAt(j + 1) == '>') {
                    belgi = j;
                    break;
                }
            }
            char left = rule.charAt(0);
            char right = rule.charAt(belgi + 2);

            if (left == right) {
                count++;
            }
        }
        System.out.println(count);
    }
}
