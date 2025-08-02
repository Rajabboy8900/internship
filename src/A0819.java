import java.util.Scanner;

public class A0819 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long a = cin.nextLong();
        long b = cin.nextLong();
        long c = cin.nextLong();

        long sirtYuzi = (2 * ((a * b) + (b * c) + (a * c)));
        long hajm = (a * b * c);
        System.out.println(sirtYuzi+" "+hajm);

    }
}