import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ditemukan = false;

        System.out.print("Masukkan jumlah data : ");
        int[] nilai = new int[sc.nextInt()];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        sc.close();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " yang dicari tidak ditemukan dalam array " + Arrays.toString(nilai));
        }
    }
}
