import java.util.Scanner;

public class A0147 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int b = cin.nextInt();

        int a0 = 0 , a1 = 1 , result = 0;

        if (b == 0){
            result = 0;
        } else if (b == 1) {
            result = 1;
        }else {
            for (int i = 2; i <= b; i++) {
                result = a0 + a1;
                a0 = a1;
                a1 = result;
            }
        }
        System.out.println(result);
    }
}
