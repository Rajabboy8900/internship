import java.util.Scanner;

public class A0324 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();

        int d1 = a / 1000;
        int d2 = (a / 100) % 10;
        int d3 = (a / 10) % 10;
        int d4 = a % 10;

        if (d1 ==d4 && d2 ==d3) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



