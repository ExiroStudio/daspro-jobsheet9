import java.util.Scanner;

public class ArrayRataNilai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2;

        int mhs = 0, total = 0, lulus = 0;
        do {
            System.out.print("Masukkan jumlah mahasiswa: ");
            mhs = sc.nextInt();
            if (mhs <= 0)
                System.out.println("Jumlah mahasiswa tidak valid, ulangi");
        } while (mhs <= 0);
        int[] nilaiMhs = new int[mhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        sc.close();
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70)
                lulus++;
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + lulus);
        String status = (rata2 >= 85 ? "SANGAT BAIK" : rata2 >= 70 ? "BAIK" : "PERLU PENDAMPINGAN");
        System.out.println("Predikat kelas: " + status);
    }
}
