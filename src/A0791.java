import java.util.Scanner;

public class A0791 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt(); // a 1 dan 64 tacaha raqam

        boolean first = true; // birinchi sonni chiqarganda bosh joy bo'lmasa ddayna

        // pasdagi qo'shnikatak mavjudmi dagan
        if (a - 8 >= 1) {
            if (!first) System.out.print(" ");
            System.out.print(a - 8); //pastdagi katak raqamini oladi dapapda BO'LMASA
            first = false; // indi birinchiya amas keyinki galyanlara joy gark bo'laddi
        }

        // chapdagi qo'shni katak mavjudmi ???????
        if ((a - 1) % 8 != 0) {
            if (!first) System.out.print(" ");
            System.out.print(a - 1); //chapdagi katak raqamini chiqaradi
            first = false;
        }

        // o'ngdagi katak bormi yoqmi tekshiradi
        if (a % 8 != 0) {
            if (!first) System.out.print(" ");
            System.out.print(a + 1); // O‘ngdagi katak raqamini chaqiradi
            first = false;
        }

        // Yuqoridagi katak bormi yo'qmi tekshiradi
        if (a + 8 <= 64) {
            if (!first) System.out.print(" ");
            System.out.print(a + 8); // Yuqoridagi katakni chiqaradi
        }
    }
}