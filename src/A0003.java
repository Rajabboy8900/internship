import java.util.Scanner;

public class A0003 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A = cin.nextInt();

        int B = A / 10;
        int result = B * (B + 1);

        if (result == 0) {
            System.out.println("25");
        } else {
            System.out.println(result + "25");
        }
    }
}
