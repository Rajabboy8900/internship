import java.util.Scanner;

public class A0025 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        if (a < b) {
            System.out.print("<");
        } else if (a > b) {
            System.out.print(">");
        } else {
            System.out.print("=");
        }

    }
}

