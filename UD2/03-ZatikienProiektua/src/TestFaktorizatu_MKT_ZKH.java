import java.util.Arrays;
import java.util.Scanner;

public class TestFaktorizatu_MKT_ZKH {
    public static void main(String[] args) {
        int n1;
        int n2;
        int[] emaitza;
        Scanner in = new Scanner(System.in);
        System.out.print("Esan bi zenbaki: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        in.close();

        emaitza = Zatikia.faktorizatu(n1);
        System.out.println("Lehenengo zenbakiaren faktoreak: " + Arrays.toString(emaitza));
        emaitza = Zatikia.faktorizatu(n2);
        System.out.println("Lehenengo zenbakiaren faktoreak: " + Arrays.toString(emaitza));
        
        System.out.println("Bi zenbakien mkt: " + Zatikia.mkt(n1, n2));
        
    }
}
