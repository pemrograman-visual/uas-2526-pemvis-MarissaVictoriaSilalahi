//12S25056-AraunaManurung
//12S25055-MarissaSilalahi
import java.util.*;
import java.lang.Math;

public class Soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;
        String nama;
        int shift;
        double totalShift;
        int maxShift;
        int minShift;
        String maxNama;
        String minNama;
        double rata;

        totalShift = 0;
        maxShift = -1;
        minShift = 9999;
        n = Integer.parseInt(input.nextLine());
        System.out.println("Daftar Shift:");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            shift = Integer.parseInt(input.nextLine());
            System.out.println(nama + " = " + shift);
            totalShift = totalShift + shift;
            if (shift > maxShift) {
                maxShift = shift;
                maxNama = nama;
            }
            if (shift < minShift) {
                minShift = shift;
                minNama = nama;
            }
        }
        System.out.println("");
        rata = totalShift / n;
        System.out.println("Total shift = " + totalShift);
        System.out.println("Rata-rata = " + rata);
        System.out.println("Shift terbanyak: " + maxNama + " (" + maxShift + ")");
        System.out.println("Shift tersedikit: " + minNama + " (" + minShift + ")");
        System.out.println("");
        if (maxShift - minShift > 3) {
            System.out.println("Distribusi shift tidak merata, beberapa asisten terbebani.");
        } else {
            System.out.println("Distribusi shift cukup merata.");
        }
    }
}
