import java.util.Scanner;

public class A0004 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int birinchiRaqam = cin.nextInt();
        int ikkinchi = 9;
        int uchinchi = ikkinchi - birinchiRaqam;

        int result = birinchiRaqam * 100 + ikkinchi * 10 + uchinchi;

        System.out.print(result);
    }
}
