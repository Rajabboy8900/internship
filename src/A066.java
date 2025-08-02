import java.util.Scanner;

public class A066 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String letter = cin.next().trim();

        String qator1 = "qwertyuiop";
        String qator2 = "asdfghjkl";
        String qator3 = "zxcvbnm";

        String result = " ";

        if (qator1.contains(letter)) {
            int i = qator1.indexOf(letter);
            if (i == qator1.length() - 1) {
                result = "a";
            } else {
                result = String.valueOf(qator1.charAt(i + 1));
            }
        } else if (qator2.contains(letter)) {
            int i = qator2.indexOf(letter);
            if (i == qator2.length() - 1) {
                result = "z";
            } else {
                result = String.valueOf(qator2.charAt(i + 1));
            }
        } else if (qator3.contains(letter)) {
            int i = qator3.indexOf(letter);
            if (i == qator3.length() - 1) {
                result = "q";
            } else {
                result = String.valueOf(qator3.charAt(i + 1));
            }
        }

        System.out.println(result);
    }
}