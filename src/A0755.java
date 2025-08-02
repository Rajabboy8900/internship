import java.util.Scanner;

public class A0755 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        int total = a + b;

        if (total >= c){
            System.out.print(total - c);
        } else {
            System.out.print("Impossible");
        }
    }
}
