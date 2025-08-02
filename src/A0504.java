import java.util.Scanner;

public class A0504 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int K = cin.nextInt();

        char a = 'G', b = 'C', c = 'V';

        for (int i = 0; i < K; i++) {
            char temp = b; b = c; c = temp;
             temp = a; a = b; b = temp;
        }
        System.out.println(" "+a + b + c);    }
}










