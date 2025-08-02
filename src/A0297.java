import java.util.Scanner;

public class A0297 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.next();

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char n = a.charAt(i);

            if (n == '0' || n == '6' || n == '9') {
                count += 1;
            } else if (n == '8') {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
