import java.util.Scanner;

public class A0514 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int k = cin.nextInt();
//        hoziracha nichcha qadam qo'yig'oni
        int step = 0;
//        qadamloni yig'indisi
        int sum = 0;
//whileda : yana bir qator qoi'shsam k dan oshib getmaslikini tekshirib qo'ydim
        while (sum + (step + 1) <= k) {
//             keyinki qadamni olamiz beda
            step++;
//            shu qadamni umumiy balandlika qo'shdim
            sum += step;
        }
// nichcha qadam qo'yishi mumkilikini chiqaramiz
        System.out.println(step);
    }
}
