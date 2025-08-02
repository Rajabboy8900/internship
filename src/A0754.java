import java.util.Scanner;

public class A0754 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int m1 = cin.nextInt();
        int m2 = cin.nextInt();
        int m3 = cin.nextInt();


        boolean tekshiruvUchun = (m1 >= 94 && m1 <= 727) &&
                (m2 >= 94 && m2 <= 727) &&
                (m3 >= 94 && m3 <= 727);


        if (tekshiruvUchun) {
            int max = Math.max(m1, Math.max(m2, m3));
            System.out.print(max);
        } else {
            System.out.print("Error");
        }
    }
}
