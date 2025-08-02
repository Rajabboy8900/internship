import java.util.Scanner;

public class A0043 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String n = cin.next();
        int max = 0;
        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }


        System.out.println(max);
    }
}