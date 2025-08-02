import java.util.Scanner;

public class A0327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int t = 0; t < k; t++) {
            String ticket = sc.next();        // 6 xonali raqam
            int num = Integer.parseInt(ticket);   // butun songa aylatrrdim

            boolean found = false; // bor yoki yoqliqini tekshirdim

            // num - 1 va num + 1
            for (int d = -1; d <= 1; d += 2) {
                int newNum = num + d; // Avvalki yoki keyikni ligini tekshirdm

                // 6 xonadan chiqib getmasliki uchun shart bardim
                if (newNum < 0 || newNum > 999999) continue;

                int[] digits = new int[6]; // har bir raqamni alohida saqladm
                int temp = newNum;

                // birraqamnni chapdan o'nga 6 taga ajratamiz
                for (int i = 5; i >= 0; i--) {
                    digits[i] = temp % 10; // Oxirgi raqamnni olaman
                    temp /= 10;            // Keyinki raqama o'taman
                }
                // aldin 3 raqamni yigindisi
                int sum1 = digits[0] + digits[1] + digits[2];
                // oxrqi 3 raqam yig'indisi
                int sum2 = digits[3] + digits[4] + digits[5];

                //  baxtli chipta bo‘lsa
                if (sum1 == sum2) {
                    found = true; // topildi dimiz
                    break;
                }
            }

            // YES va NO
            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}