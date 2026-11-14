import java.util.Scanner;

public class Tugas1PengelolaanNilaiMahasiswa30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mhs = 0;
        do {
            System.out.print("Masukkan banyak mahasiswa : ");
            mhs = sc.nextInt();
            if (mhs <= 0) {
                System.out.println("Data jumlah mahasiswa tidak valid, Ulangi");
            }
        } while (mhs <= 0);
        int[] nilaiMhs = new int[mhs];
        for (int i = 0; i < nilaiMhs.length;) {
            System.out.print(String.format("Masukkan nilai mahasiswa ke-%s : ", (i+1)));
            int nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai mahasiswa tidak valid, mohon masukkan ulang");
                continue;
            }
            nilaiMhs[i] = nilai;
            i++;
        }
    }
}
