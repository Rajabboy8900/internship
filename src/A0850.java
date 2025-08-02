import java.util.Scanner;

public class A0850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int minTurnalar = (Math.min(a, b));
        int maxTurnalar = (Math.max(a , b) + 1)/2;

        System.out.println(maxTurnalar+" "+minTurnalar);
    }
}























































//
//
//import java.util.Scanner;
//import java.io.File;
//import java.io.PrintWriter;
//
//public class Storks {
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(new File("INPUT.TXT"));
//        PrintWriter out = new PrintWriter("OUTPUT.TXT");
//
//        int a = in.nextInt();
//        int b = in.nextInt();

//        int minStorks = (Math.max(a, b) + 1) / 2;
//        int maxStorks = Math.min(a, b);
//
//        out.println(minStorks + " " + maxStorks);
//
//        out.close();
//    }
//}
