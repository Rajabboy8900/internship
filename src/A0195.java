import java.util.Scanner;

public class A0195 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();

        int birPanelYuzasi = a * b;
        int nanogram = birPanelYuzasi * n * 2;

        System.out.print(nanogram);
    }
}
