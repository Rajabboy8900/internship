import java.util.Scanner;

public class A0264 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int maxLength = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            int s = cin.nextInt();
            if(s > 0){
                current++;
                if (current > maxLength){
                    maxLength = current;
                }
            }else {
                current = 0;
            }
        }

        System.out.println(maxLength);

    }
}

