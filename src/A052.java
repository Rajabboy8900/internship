import java.util.Scanner;

public class A052 {
    public static void main(String[] args) {
        Scanner tickets = new Scanner(System.in);
        String num = tickets.next();
        int a = 0;
        int b = 0;


        for (int i = 0; i < 3 ; i++) {
            a +=  num.charAt(i) - '0';
            b += num.charAt(i + 3) - '0';

        }

        if (a == b) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
