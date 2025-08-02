
import java.util.Scanner;
public class A0948 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int K = sc.nextInt();
        int N = sc.nextInt();

        int pageNumber = (N - 1) / K + 1;
        int lineOnPage = (N - 1) % K + 1;


        System.out.println((pageNumber + " " + lineOnPage));
    }
}
