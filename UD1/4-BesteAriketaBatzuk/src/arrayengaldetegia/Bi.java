package arrayengaldetegia;
import java.util.Arrays;

public class Bi {
    public static void main(String[] args) {
        int[] zenbakiak = new int[10];

        zenbakiak[0] = 1;
        for (int i = 1; i < zenbakiak.length; i++) {
            zenbakiak[i] = 2 * zenbakiak[i-1] ;
        }
        System.out.println(Arrays.toString(zenbakiak));
    }
}
