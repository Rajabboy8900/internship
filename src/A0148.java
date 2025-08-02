import java.util.Scanner;

public class A0148 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
         int a = cin.nextInt();
         int b = cin.nextInt();
           while (b != 0){
               int c = b;
               b = a % b;
               a = c;
           }
        System.out.println(a);
    }
}
//evklid teoremasi
