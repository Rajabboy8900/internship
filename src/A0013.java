import java.util.Scanner;

public class A0013 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String a = cin.next();
        String b = cin.next();

        int buqa = 0;
        int sigir = 0;

        for (int i = 0; i < 4; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                buqa++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j && a.charAt(i) == b.charAt(j)) {
                    sigir++;
                }

            }
        }
        System.out.println(buqa + " " + sigir);
    }

}

