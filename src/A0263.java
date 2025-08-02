//import java.util.Scanner;
//
//public class A0263 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int N = cin.nextInt();
//        int i = cin.nextInt();
//        int j = cin.nextInt();
//
//            int oraliqStansiya0;
//
//                int soatYonalishiBoyicha = (j - i + N) % N - 1;
//                int teskariYonalishBoyicha = (i - j + N) % N - 1;
//
//        System.out.println(Math.min(soatYonalishiBoyicha, teskariYonalishBoyicha));
//    }
//}





//import java.util.Scanner;
//
//public class A0263 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int N = cin.nextInt();
//        int i = cin.nextInt();
//        int j = cin.nextInt();
//        int maxS = Math.max(i, j);
//        int minS = Math.min(i, j);
//
//        int soatYonalishiBoyicha = maxS - minS - 1;
//        int teskariYonalishBoyicha = N - (maxS - minS) - 1;
//
//        System.out.println(Math.min(soatYonalishiBoyicha, teskariYonalishBoyicha));
//    }
//}