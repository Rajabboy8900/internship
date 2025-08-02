import java.util.Scanner;

public class A0839 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String a = cin.next();

        if (a.contains("0") ) {
            System.out.println("NO");
        } else if (!a.contains("0")) {
            System.out.println("YES");
        }
    }
}
