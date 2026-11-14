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
        
    }
}
