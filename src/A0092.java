import java.util.Scanner;

public class A0092 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

         int A = cin.nextInt();
         int X = A / 6;

         int PETYA = X;
         int KATYA = 4 * X;
         int SEREJA = X;

         System.out.print(PETYA+" "+KATYA+" "+SEREJA);
    }
}
