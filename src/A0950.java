import java.io.*;
import java.util.Scanner;

public class A0950 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String binary = cin.nextLine();
        String result = "";

        int i = 0;
        while (i < binary.length()) {
            int zeroCount = 0;

            // 0 larni sanadim
            while (i < binary.length() && binary.charAt(i) == '0') {
                zeroCount++;
                i++;
            }

            // indi bir bo'lishi garak
            if (i < binary.length() && binary.charAt(i) == '1') {
                result = result + (char) ('a' + zeroCount);
                i++;
            }
        }

        System.out.println(result);
    }
}
