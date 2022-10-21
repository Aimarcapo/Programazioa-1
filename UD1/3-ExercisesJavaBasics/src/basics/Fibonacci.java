package basics;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int biAtzera = 0, batAtzera = 1, emaitza, kop;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbat zenbaki kopuru nahi duzun: ");
        kop = in.nextInt();
        in.close();

        System.out.print(biAtzera + " " + batAtzera);

        for(int i = 2; i < kop; i++){
            emaitza = biAtzera + batAtzera;
            System.out.print(" " + emaitza);

            biAtzera = batAtzera;
            batAtzera = emaitza;
        }

    }
}
