import java.util.Scanner;

public class A798 {
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        long m = cin.nextLong();
        long n = cin.nextLong();
        long i = cin.nextLong();
        long j = cin.nextLong();
        int c = cin.nextInt();

        long total = m * n;
        //agar xujayralar soni juft bo'lsa bunda ikkisi dang bo'ladi
        if (total % 2 == 0) {

            System.out.println("equal");
        } else {
            if (((i + j) % 2) == 0) {
                System.out.println(c == 0 ? "black" : "white");
           } else {
                System.out.println(c == 0 ? "white" : "black");
            }
        }

    }
}
