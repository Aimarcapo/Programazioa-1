package aceptaElReto;

import java.util.Scanner;

public class UltimoDigitoFactorial {
    public static void main(String[] args) {
        int bueltaKop;
        int[] zenbakiak;

        /*Arraya bete */
        Scanner in = new Scanner(System.in);
        bueltaKop = in.nextInt();
        zenbakiak = new int[bueltaKop];
        for(int i = 0; i < bueltaKop; i++){
            zenbakiak[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < bueltaKop; i++) {
            int faktoriala=1;
            /*faktoriala lortu */
            while(zenbakiak[i]>0){
                faktoriala *= zenbakiak[i];
                zenbakiak[i]--;
            }
            /*emaitza erakutzi */
            System.out.println(faktoriala%10);
        }
    }
}
