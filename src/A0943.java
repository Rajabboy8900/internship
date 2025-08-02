import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class A0943 {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);

        int N = cin.nextInt(); // qatorlar soni
        int M = cin.nextInt(); // ustunlar soni
        int Y = cin.nextInt(); // qatorimiz 1 dan boshlanadi
        int X = cin.nextInt(); // ustunimiz 1 dan boshlanadi

        int row = Y - 1; // o linchi indexdan boshlash uchun
        int C;

        if(row % 2 == 0){
            // juft qator bolsa chapdan o'nga
            C = X - 1;
        } else {
            // toq qator bolsa o'ngnan chapa
            C = M - X;
        }

        int result = row * M + C; // umumiy indeksni hisoblab oldim
        System.out.println(result);
    }
}
