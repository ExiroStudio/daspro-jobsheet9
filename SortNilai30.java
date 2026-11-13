import java.util.Arrays;

public class SortNilai30 {
    public static void main(String[] args) {
        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j + 1] > nilai[j]) {
                    int temp = nilai[j + 1];
                    nilai[j + 1] = nilai[j];
                    nilai[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
