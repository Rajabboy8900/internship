import java.util.Scanner;

public class A0331 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] t = in.nextLine().split(":");
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int dh = in.nextInt();
        int dm = in.nextInt();

        int min = (h * 60 + m + dh * 60 + dm) % 1440;
      int resH = min / 60;
        int resM = min % 60;

        String hh = resH < 10 ? "0" + resH : "" + resH;
        String mm = resM < 10 ? "0" + resM : "" + resM;

        System.out.println(hh + ":" + mm);
    }
}







































