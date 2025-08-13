//import java.util.Scanner;
//
//public class A0940 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//
//        int k = cin.nextInt();
//        String s = cin.next();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (i != k - 1) {
//                System.out.print(s.charAt(i) + "");
//            }
//        }
//    }
//}


import java.util.Scanner;

public class A0940 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int k = cin.nextInt();
        String s = cin.next();

        String result = s.substring(0, k -1) + s.substring(k);

        System.out.println(result);
    }
}
