import java.util.Scanner;

public class A0907 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int e = cin.nextInt();
        int b = cin.nextInt();
        int r = cin.nextInt();

        if((2 * r) <= e && (2 * r) <= b){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
