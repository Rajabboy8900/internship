import java.util.Scanner;

public class A0062 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
           String c = cin.next();
           int x = c.charAt(0) - 'A' + 1;
           int y = c.charAt(1) - 'O';


        if ((x + y) % 2 != 0) {
            System.out.println("BLACK");
        } else if ((x + y) % 2 == 0) {
            System.out.println("WHITE");
        }
    }
}
