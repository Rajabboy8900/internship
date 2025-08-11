import java.util.Scanner;

public class A0028 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
       int x1 = cin.nextInt();
       int y1 = cin.nextInt();
       int x2 = cin.nextInt();
       int y2 = cin.nextInt();

       int xa = cin.nextInt();
       int ya = cin.nextInt();

       int xb = 0;
       int yb = 0;

        if (x1 == x2) {
            xb = 2 * x1 - xa;
            yb = ya;
        }else if (y1 == y2){
            xb = xa;
            yb = 2 * y2 - ya;
        }
        System.out.println(xb+" "+yb);
    }
}
