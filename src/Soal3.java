//12S25056-AraunaManurung
//12S25055-MarissaSilalahi

import java.util.*;
import java.lang.Math;

public class Soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;
        int j;
        String nama;
        int jumlahPerangkat;
        int daya;
        int totalSiswa;
        int totalKamar;

        totalKamar = 0;
        n = Integer.parseInt(input.nextLine());
        System.out.println("Total konsumsi:");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlahPerangkat = Integer.parseInt(input.nextLine());
            totalSiswa = 0;
            for (j = 1; j <= jumlahPerangkat; j++) {
                daya = Integer.parseInt(input.nextLine());
                if (daya < 0) {
                    System.out.println("INVALID");
                    j = j - 1;
                } else {
                    totalSiswa = totalSiswa + daya;
                }
            }
            System.out.println(nama + " = " + totalSiswa + " wh");
            totalKamar = totalKamar + totalSiswa;
        }
        System.out.println("");
        System.out.println("Total konsumsi kamar = " + totalKamar + " wh");
        if (totalKamar > 1200) {
            System.out.println("Konsumsi berlebihan, kurangi penggunaan listrik!");
        } else {
            System.out.println("Konsumsi masih dalam batas wajar.");
        }
    }
}
