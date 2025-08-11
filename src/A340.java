import java.util.Scanner;

public class A340 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int A1 = cin.nextInt();
        int B1 = cin.nextInt();
        int C1 = cin.nextInt();

        int A2 = cin.nextInt();
        int B2 = cin.nextInt();
        int C2 = cin.nextInt();

        int x1 = Math.min(A1, Math.min(B1, C1));
        int z1 = Math.max(A1, Math.max(B1, C1));
        int y1 = A1 + B1 + C1 -x1 - z1;

        int x2 = Math.min(A2, Math.min(B2, C2));
        int z2 = Math.max(A2, Math.max(B2, C2));
        int y2 = A2 + B2 + C2 - x2 - z2;




        if (x1 == x2 && y1 == y2 && z1 == z2 ) {
            System.out.println("Boxes are equal");
        } else if (x1 <= x2 && y1 <= y2 && z1 <= z2) {
            System.out.println("The first box is smaller than the second one");
        } else if (x1 >= x2 && y1 >= y2 && z1 >= z2) {
            System.out.println("The first box is larger than the second one");
        }else {
            System.out.println("Boxes are incomparable");
        }


    }
}
