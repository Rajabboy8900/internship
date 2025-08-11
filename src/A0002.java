import java.util.Scanner;

public class A0002 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int count = 0;

        if (a >= 1) {
            for (int i = 1; i <= a ; i++) {
                count += i;
            }
        }else if (a < 1){
            for (int i = 1; i >= a; i--) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
