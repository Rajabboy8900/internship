
import java.util.Arrays;
import java.util.Scanner;

public class A0633 {
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);

        String jamoaNomi = cin.nextLine();

        String[] azolar = new String[3];
        for (int i = 0; i < 3; i++) {
            azolar[i] = cin.nextLine();
        }

        Arrays.sort(azolar);

        String result = jamoaNomi + ": " + String.join(", ", azolar);
        System.out.println(result);
    }
}












































































//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//
//        // 1. Jamoa nomini o‘qish
//        String teamName = cin.nextLine();
//
//        // 2. 3 ta familiyani o‘qish
//        String[] members = new String[3];
//        for (int i = 0; i < 3; i++) {
//            members[i] = cin.nextLine();
//        }
//
//        // 3. Qo‘lda alfavit bo‘yicha sortlash (case-insensitive)
//        for (int i = 0; i < members.length - 1; i++) {
//            for (int j = i + 1; j < members.length; j++) {
//                if (members[i].compareToIgnoreCase(members[j]) > 0) {
//                    String temp = members[i];
//                    members[i] = members[j];
//                    members[j] = temp;
//                }
//            }
//        }
//
//        // 4. Natijani format qilish
//        String result = teamName + ": " + String.join(", ", members);
//
//        // 5. Chiqazish
//        System.out.println(result);
//    }
//}



