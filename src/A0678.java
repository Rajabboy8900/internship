import java.util.Scanner;

public class A0678 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String moves = cin.next();


        int pos = 1;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == 'A') {
                if (pos == 1) pos = 2;
                else if (pos == 2) pos = 1;
            } else if (move == 'B') {
                if (pos == 2) pos = 3;
                else if (pos == 3) pos = 2;
            } else if (move == 'C') {
                if (pos == 1) pos = 3;
                else if (pos == 3) pos = 1;
            }
        }
        System.out.println(pos);
    }
}












































































//import java.util.Scanner;
//
//public class Napyorstok {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String moves = in.nextLine();
//
//        int pos = 1; // Shar boshlanishda 1-pozitsiyada
//
//        for (int i = 0; i < moves.length(); i++) {
//            char move = moves.charAt(i);
//            if (move == 'A') {
//                if (pos == 1) pos = 2;
//                else if (pos == 2) pos = 1;
//            } else if (move == 'B') {
//                if (pos == 2) pos = 3;
//                else if (pos == 3) pos = 2;
//            } else if (move == 'C') {
//                if (pos == 1) pos = 3;
//                else if (pos == 3) pos = 1;
//            }
//        }
//
//        System.out.println(pos);
//    }
//}




