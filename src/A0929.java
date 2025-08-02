import java.util.Scanner;

public class A0929 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
//eng kam kubiklar soni
        long minDice = (n + 5) / 6;
//        eng kam bal
        long minSecondPlayer = minDice * 7 - n;
//        eng ko'p bal
        long maxSecondPlayer = n * 6;


        System.out.println(minSecondPlayer + " " + maxSecondPlayer);
    }
}

