import java.util.Scanner;

public class A0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Elementlar soni

        int[] all = new int[a];  // hamma gunla
        int[] toq = new int[a];  // Toq gun
        int[] juft = new int[a]; // Juft gun

        int toqKunlarSoni = 0;
        int juftKunlarSoni = 0;

        // Kunlarni o‘qib ajratamiz
        for (int i = 0; i < a; i++) {
            all[i] = sc.nextInt();
            if (all[i] % 2 == 0) {
                juft[juftKunlarSoni++] = all[i];
            } else {
                toq[toqKunlarSoni++] = all[i];
            }
        }

        //  toq gunlar
        for (int i = 0; i < toqKunlarSoni; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(toq[i]);
        }
        System.out.println(); //taza qatara o'tamiz

        // juft gunlar
        for (int i = 0; i < juftKunlarSoni; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(juft[i]);
        }
        System.out.println(); // mndam toza qatora o'tamiz

        // YES bilan NO
        if (juftKunlarSoni >= toqKunlarSoni) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}