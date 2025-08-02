
import java.util.Scanner;
public class A0691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // nichcha raqam girizilganni o'qib oldim
        String letters = "ABCEHKMOPTXY"; // Ruxsat atilgan xarflar

        for (int i = 0; i < N; i++) {
            String plate = sc.nextLine(); // har bir avtobus raqamini o'qib oloman
            boolean isValid = true;

            // Avtobus nomeri 6 uzunligda bo'lishi kerak
            if (plate.length() != 6) {
                isValid = false;
            }

            //birinci belgidagi xarfa ruxsat barilyanmi yo'qmi shuni tekshiramiz
            if (isValid) {
                char c1 = plate.charAt(0);
                if (letters.indexOf(c1) == -1) {
                    isValid = false;
                }
            }

            // 2, 3, 4 inchi raqamlar faqa 0- 9 acha son bo'lishi garak
            if (isValid) {
                char c2 = plate.charAt(1);
                char c3 = plate.charAt(2);
                char c4 = plate.charAt(3);
                if (!(c2 >= '0' && c2 <= '9' &&
                        c3 >= '0' && c3 <= '9' &&
                        c4 >= '0' && c4 <= '9')) {
                    isValid = false;
                }
            }

            // 5 6 chi belgilar faqat ruxsat atilgan xarfdan iborat bo'lishi garak
            if (isValid) {
                char c5 = plate.charAt(4);
                char c6 = plate.charAt(5);
                if (letters.indexOf(c5) == -1 || letters.indexOf(c6) == -1) {
                    isValid = false;
                }
            }

            // YES bilan NO
            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}