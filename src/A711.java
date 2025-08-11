import java.util.Scanner;
//import static java.lang.Integer.MAX_VALUE;
public class A711 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        String win = "";
        int min = 0;

        for (int i = 0; i < a; i++) {
            cin.nextLine();
            String name = cin.nextLine();
            int sum = 0;
            for (int j = 0; j < b; j++) {
                sum += cin.nextInt();
            }

            if (i == 0||sum < min) {
                min = sum;
                win = name;
            }
        }
        System.out.println(win);
    }
}