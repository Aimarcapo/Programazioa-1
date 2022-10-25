/* Programa honek, array baten baloreak betetzea eskatuko 
du, eta balore bakoitzaren bikoitza bueltatuko du beste array batean. */

import java.util.Arrays;
import java.util.Scanner;

public class Bikoitza {
    public static void main(String[] args) {
        final int tamaina = 5;
        int [] zenbakiak, bikoitza;
            
        zenbakiak = new int[tamaina];
        bikoitza = new int[tamaina];

        Scanner in = new Scanner(System.in);

        System.out.print("Sartu itzazu " + tamaina + " zenbaki espazioz bananduta: ");
        
        for(int i = 0; i < zenbakiak.length; i++){
            zenbakiak[i] = in.nextInt();
        }

        in.close();

        System.out.println(Arrays.toString(zenbakiak));

        for(int a = 0; a < bikoitza.length; a++){
            bikoitza[a] = zenbakiak[a] * 2;
        }

        System.out.println(Arrays.toString(bikoitza));

    }
}
