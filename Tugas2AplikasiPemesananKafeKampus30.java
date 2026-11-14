import java.util.Scanner;
public class Tugas2AplikasiPemesananKafeKampus30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };
        int jmlPesan = 0;
        do {
            System.out.print("Masukkan jumlah menu yang ingin dipesan : ");
            jmlPesan = sc.nextInt();
            if (jmlPesan <= 0) {
                System.out.println("Jumlah pesanan tidak valid, mohon ulangi");
            }
        } while (jmlPesan <= 0);
        sc.nextLine();
        String[] pesanan = new String[jmlPesan];
        int[] pesananHarga = new int[jmlPesan];

        for (int i = 0; i < pesanan.length;) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + " yang ingin dipesan : ");
            String namaMenu = sc.nextLine().trim();
            boolean ditemukan = false;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(namaMenu)) {
                    ditemukan = true;
                    System.out.println("Menu  = " + menu[j]);
                    System.out.println("Harga = Rp." + harga[j]);
                    pesanan[i] = menu[j];
                    pesananHarga[i] = harga[j];
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println(String.format("Menu %s tidak tersedia", namaMenu));
                continue;
            }
            i++;
        }
        int total = 0;
        System.out.println("\n=== REKAP PESANAN ===");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Menu  = " + pesanan[i] + " ");
            System.out.println(": Rp." + pesananHarga[i]);
            total += pesananHarga[i];
        }
        System.out.println("Total Harga = Rp." + total);
        sc.close();
    }
}
