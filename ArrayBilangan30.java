import java.util.Arrays;

public class ArrayBilangan30 {
    public static void main(String[] args) {
        int[] bil = new int[] { 5, 13, -7, 17 };
        for (int i = 0; i < bil.length; i++) {
            System.out.println(String.format("bil [%s]", bil[i]));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
