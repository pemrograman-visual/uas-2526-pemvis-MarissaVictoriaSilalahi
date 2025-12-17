import java.util.*;
import java.lang.Math;

public class Soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;
        String nama;
        int stokAwal;
        int terjual;
        int sisa;
        String status;

        n = Integer.parseInt(input.nextLine());
        System.out.println("Nama" + (char) 9 + "StokAwal" + (char) 9 + "Terjual" + (char) 9 + "Sisa" + (char) 9 + "Status");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            stokAwal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            sisa = stokAwal - terjual;
            if (sisa == 0) {
                status = "Habis,segera restock!";
            } else {
                if (sisa < 5) {
                    status = "Stok menipis";
                } else {
                    status = "Stok aman";
                }
            }
            System.out.println(nama + (char) 9 + stokAwal + (char) 9 + (char) 9 + terjual + (char) 9 + (char) 9 + sisa + (char) 9 + status);
        }
    }
}
