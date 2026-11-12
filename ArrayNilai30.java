import java.util.Scanner;

public class ArrayNilai30 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        int nomor = 1;
        for (int nilai : nilaiAkhir) {
            if (nilai <= 70) {
                System.out.println("Mahasiswa ke-" + nomor + ": " + nilai + " (LULUS)");
            }
            nomor++;
        }
        input.close();
    }
}
