import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A0817 {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);


        long n = cin.nextLong();  // avenyulo soni
        long m = cin.nextLong();  // ko‘chala soni
        long d = cin.nextLong();  // eni
        long k = cin.nextLong();  // bo'yi


        long avenyu = n * k * d;
        long kocha = m * k * d;
        long ortiqi = n * m * d * d;

        System.out.println(avenyu + kocha - ortiqi);
    }
}
