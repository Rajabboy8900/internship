import java.util.Scanner;

public class A0943 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        int Y = cin.nextInt();
        int X = cin.nextInt();

        int row = Y -1;
        int C;

        if(row % 2 == 0){
            C = X - 1 ;
        }else {
            C = M - X;
        }

        int result = row * M + C;
        System.out.println(result);





    }
}
