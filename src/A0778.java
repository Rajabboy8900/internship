import java.util.Scanner;

public class A0778 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 31; i++) {
            total += cin.nextInt();
        }
        System.out.println(total / 27);
    }
}
