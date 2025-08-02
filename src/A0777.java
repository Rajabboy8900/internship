import java.util.Scanner;

public class A0777 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        int result = (b - a + 12) % 12;
        System.out.println(result);
    }
}
