import java.util.Scanner;

public class A0061 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < 4; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();

            total1 += a;
            total2 += b;
        }
       if (total1 > total2){
           System.out.print("1");
       } else if (total1 < total2) {
           System.out.print("2");
       } else{
           System.out.print("DRAW");
       }
    }
}
