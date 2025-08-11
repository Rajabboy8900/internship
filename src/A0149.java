import java.util.Scanner;

public class A0149 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = cin.nextInt();
        }

        for (int i = a - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);

            if (i != 0){
                System.out.println(" ");
            }
        }
    }
}
