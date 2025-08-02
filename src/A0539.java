import java.util.Scanner;

public record A0539() {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int N = cin.nextInt();

            int kesishlar;

            if (N == 1){
                kesishlar = 0;
            } else if (N % 2 == 0) {
                kesishlar = N / 2;
            }else {
                kesishlar = N;
            }
            System.out.print(kesishlar);
    }
}
