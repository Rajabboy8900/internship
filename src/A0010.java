import java.util.Scanner;

public class A0010 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] parts = cin.nextLine().split(" ");
        int A = Integer.parseInt(parts[0]);
       int B = Integer.parseInt(parts[1]);
       int C = Integer.parseInt(parts[2]);
       int D = Integer.parseInt(parts[3]);

        for (int x = -100; x <= 100; x++) {
           long result = (long) A * x * x * x + (long) B * x * x + (long) C * x + D;
           if (result == 0) {
                System.out.print(x + " ");
            }
        }
    }
}







//public class Main {
//    public static void main(String[] args) throws Exception {
//
//        String[] parts = in.readLine().split(" ");
//        double A = Double.parseDouble(parts[0]);
//        double B = Double.parseDouble(parts[1]);
//        double C = Double.parseDouble(parts[2]);
//        double D = Double.parseDouble(parts[3]);
//
//        int[] roots = new int[201];
//        int count = 0;
//
//        for (int x = -100; x <= 100; x++) {
//            double val = A * x * x * x + B * x * x + C * x + D;
//
//            if (Math.abs(val) < 1e-9) {
//                boolean already = false;
//                for (int i = 0; i < count; i++) {
//                    if (roots[i] == x) {
//                        already = true;
//                        break;
//                    }
//                }
//                if (!already) {
//                    roots[count++] = x;
//                }
//            }
//        }

//        for (int i = 0; i < count - 1; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (roots[i] > roots[j]) {
//                    int temp = roots[i];
//                    roots[i] = roots[j];
//                    roots[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            out.print(roots[i] + " ");
//        }
//
//        out.close();
//    }
//}