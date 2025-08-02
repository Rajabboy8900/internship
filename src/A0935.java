import java.util.Scanner;

public class A0935 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int x2 = cin.nextInt();
        int y2 = cin.nextInt();


        boolean colorOne = (x1 + y1) % 2 == 0;
        boolean colorTwo = (x2 + y2) % 2 == 0;

        if(colorOne == colorTwo){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
