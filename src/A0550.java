import java.util.Scanner;

public class A0550 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int yil = cin.nextInt();
        String sana = String.valueOf(yil);


        if (yil < 10) {
            sana = "000" + sana;
        } else if (yil < 100) {
            sana = "00" + sana;
        } else if (yil < 1000) {
            sana = "0" + sana;
        }


        if ((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0)) {
            sana = "12/09/" + sana;
        } else {
            sana = "13/09/" + sana;
        }


        System.out.println(sana);
    }
}

