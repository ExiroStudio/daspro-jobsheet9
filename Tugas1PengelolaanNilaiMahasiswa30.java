import java.util.Scanner;
public class Tugas1PengelolaanNilaiMahasiswa30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mhs = 0, total = 0, tertinggi = 0, terendah = -1;
        do {
            System.out.print("Masukkan banyak mahasiswa : ");
            mhs = sc.nextInt();
            if (mhs <= 0) {
                System.out.println("Data jumlah mahasiswa tidak valid, Ulangi");
            }
        } while (mhs <= 0);
        int[] nilaiMhs = new int[mhs];
        for (int i = 0; i < nilaiMhs.length;) {
            System.out.print(String.format("Masukkan nilai mahasiswa ke-%s : ", (i + 1)));
            int nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai mahasiswa tidak valid, mohon masukkan ulang");
                continue;
            }
            nilaiMhs[i] = nilai;
            total += nilai;
            if (terendah == -1) {
                terendah = nilai;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            i++;
        }
        sc.close();
        double rata2 = (double) total / nilaiMhs.length;
        int nomor = 0;
        for (int i : nilaiMhs) {
            nomor++;
            String status = (i > 70 ? "LULUS" : "TIDAK LULUS");
            System.out.println(String.format("Nilai Mahasiswa ke-%s Nilai= %s Status= %s", nomor, i, status));
        }
        System.out.println("Rata-Rata Nilai = " + rata2);
        System.out.println("Nilai Tertinggi = " + tertinggi);
        System.out.println("Nilai Terendah  = " + terendah);

    }
}
