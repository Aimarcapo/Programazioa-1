/*Izen kopuru jakin batekin (8) egiten du lan programa honek. Erabiltzaileak espazioz bananduta idatziko ditu. 
Gero, R sakatu ezkero izenak atzero aurrera zerrendatuko dira. Sakatutakoa ez bada R, ez da ezer egingo.*/

import java.util.Scanner;

public class Izenak {
    public static void main(String[] args) {
        /*ALDAGAIAK SORTU */
        String[] hitzak;
        final String R = "R";
        String izkia;

        /*"hitzak" ARRAYAREN LUZERA/TAMAINA EZARRI */
        hitzak = new String[8];

        /*ALDAGAIAK ESKATU */
        Scanner in = new Scanner(System.in);
        System.out.print("Idatzi 8 izen: ");

        /*ARRAYAREN BALIO BAKOITZA DEFINITU */
        for (int i = 0; i < hitzak.length; i++) {
            hitzak[i] = in.next();
        }

        System.out.print("Sakatu R (everse) izenak atzekoz aurrera ikusteko: ");
        izkia = in.next();

        /*BUKAERAKO EMAITZA INPRIMATZEKO PROGRAMA ZATIA */
        if (izkia.equals(R)) {
            for (int i = 1, x = 7; x >= 0; x--, i++) {
                System.out.print(i + "- " + hitzak[x]);
                System.out.println("");
            }
        }

        in.close();
    }
}
