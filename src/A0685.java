import java.util.Scanner;
import java.util.Arrays; // sort() uchun kerak

public class A0685 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int[] A = new int[3]; // Mahsulotlar narxlari (1 kg uchun)
        int[] B = new int[3]; // Idishlarning sig‘imlari

        // 3 ta narxni o‘qish
        for (int i = 0; i < 3; i++) A[i] = cin.nextInt();
        // 3 ta sig‘imni o‘qish
        for (int i = 0; i < 3; i++) B[i] = cin.nextInt();

        // Har ikkala arrayni tartiblaymiz — eng kichikdan katta tomon
        Arrays.sort(A);
        Arrays.sort(B);

        // Eng qimmat mahsulotni eng katta sig‘imli idishga joylaymiz
        int javob = A[2]*B[2] + A[1]*B[1] + A[0]*B[0];

        System.out.println(javob);
    }
}
