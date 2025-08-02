import java.util.Scanner;

public class A0854 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int troom = cin.nextInt();
        int tcond = cin.nextInt();
        String mode = cin.next();

        int result = troom;
        

        if (mode.equals("freeze")) {
            result = Math.min(tcond, troom);
        } else if (mode.equals("heat")) {
            result = Math.max(tcond, troom);
        } else if (mode.equals("auto")) {
            result = tcond;
        } else if (mode.equals("fan")) {
            result = troom;
        }
        System.out.println(result);


    }
}
