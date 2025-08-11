import java.util.Scanner;

public class A0895 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 3;
        char[][] game_board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = cin.next();
            game_board[i] = str.toCharArray();
        }

        boolean prime_diagonal_x = true;
        boolean prime_diagonal_o = true;
        boolean second_diagonal_x = true;
        boolean second_diagonal_o = true;

        for (int i = 0; i < n; i++) {
            boolean row_x = true;
            boolean row_o = true;
            boolean col_x = true;
            boolean col_o = true;

            for (int j = 0; j < n; j++) {

                row_x = row_x && game_board[i][j] == 'X';
                row_o = row_o && game_board[i][j] == 'O';
                col_x = col_x && game_board[j][i] == 'X';
                col_o = col_o && game_board[j][i] == 'O';

            }
            if (row_x || col_x) {
                System.out.println("Win");
                return;
            } else if (row_o || col_o) {
                System.out.println("Lose");
                return;

            }
            prime_diagonal_x = prime_diagonal_x && game_board[i][i] == 'X';
            prime_diagonal_o = prime_diagonal_o && game_board[i][i] == 'O';
            second_diagonal_x = second_diagonal_x && game_board[i][n - i - 1] == 'X';
            second_diagonal_o = second_diagonal_o && game_board[i][n - i - 1] == 'O';

        }
        if (prime_diagonal_x || second_diagonal_x) {
            System.out.println("Win");
        } else if (prime_diagonal_o || second_diagonal_o) {
            System.out.println("Lose");
        } else System.out.println("Draw");

    }
}
