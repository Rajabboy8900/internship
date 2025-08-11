import java.util.Scanner;

public class A0763 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long x = cin.nextLong();
        long y = cin.nextLong();

        if (x == 1 && y == 1) {
            System.out.println(0);
        } else if (x == y ) {
            System.out.println(2);
        }else {
            System.out.println(1);
        }
    }
}


