import java.util.Scanner;

public class A0892 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int month = cin.nextInt();
         if (month == 12 || month == 1 || month ==2){
             System.out.println("Winter");
         } else if (month >= 3 && month <= 5) {
             System.out.println("Spring");
         } else if (month >= 6 && month <= 8) {
             System.out.println("Summer");
         } else if (month >= 9 && month <= 11) {
             System.out.println("Autumn");
         }else {
             System.out.println("Error");
         }
    }
}
