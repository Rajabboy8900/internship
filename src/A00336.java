import java.util.Scanner;

public class A00336 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String b = cin.next();
        int hozirgiFloor = 1;
        int minFloor = 1;
        int maxFloor = 1;

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if (c == '1') {
                hozirgiFloor++;
            } else if (c == '2') {
                hozirgiFloor--;
            }

            if (hozirgiFloor < minFloor) {
                minFloor = hozirgiFloor;
            } else if (hozirgiFloor > maxFloor) {
                maxFloor = hozirgiFloor;
            }
        }
        System.out.println(maxFloor - minFloor + 1);
    }
}
