//import java.util.Scanner;
//
//public class A0637 {
//    public static void main(String[] args) {
//        Scanner cin =  new Scanner(System.in);
//
//        int n = cin.nextInt(); // instutlar soni
//        int[] a = new int[n];  // Har bir insttutdan yubariladon jamolar soni
//
//        for (int i = 0; i < n; i++) {
//            a[i] = cin.nextInt(); // Instut i chidan nichcha jamo borligini tekshirdm
//
//        }
//
//        int k = cin.nextInt(); // zallar soni
//
//        int left = 0;
//        int right = 100000;
//        int answer = 0;
//
//        while (left <= right) {
//            int mid = (left + right) / 2; // har bir zala joylashtrish mumkin bolgan jamo soni
//            long total = 0; // umumiy joylashtradigan jamolar soni
//
//            // har bir instutdan ma(a[i], x) olish mumkin
//            for (int i = 0; i < n; i++) {
//                total += Math.min(a[i], mid);
//            }
//
//            // agar k zallarni toldrish uchun yetarli bosa degan shaart
//            if (total >= (long)k * mid) {
//                answer = mid;
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        System.out.println(answer * k);
//    }
//}
//


























//import java.util.Scanner;
//
//public class A0637 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//
//        int a = cin.nextInt();
//        int b = cin.nextInt();
//        int c = cin.nextInt();
//        int d = cin.nextInt();
//
//        int result = (a + b + c + d) - 7;
//        System.out.println(result);
//    }
//}