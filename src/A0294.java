import java.util.Scanner;

public class A0294 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int b = cin.nextInt();
        int f= cin.nextInt();
        int p = cin.nextInt();
        int b1 = cin.nextInt();
        int f1 = cin.nextInt();
        int p1 = cin.nextInt();


        int result1= (b * f * p) / 100;
        int result2 = (b1 * f1 * p1) / 100;
        int umumiy = result1 + result2;
        int bolt = (b - (b * f) / 100);
        int gaykam = (b1 - (b1 * f) / 100);


        int max = Math.max(bolt, gaykam);
        int min = Math.min(bolt, gaykam);
        int result3 = (max - min);
        int z = 0;
if (bolt > gaykam){
    z = (bolt - gaykam) * p;
}else {
    z = (gaykam - bolt) * p1;
}
        System.out.println(umumiy + z);
    }
}
