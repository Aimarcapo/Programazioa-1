/*Programa honek 1etik 50arteko zenbakiak inprimatuko ditu pantailan marratxoz bananduta. 
Hori bai, erabiltzaileak aukeratutako zenbakiaren multiplo diren zenbakiak izartxo batez ordezkatuko dira.*/

import java.util.Scanner;

public class Izartxoak {
    public static void main(String[] args) {
        /*ALDAGAIAK SORTU */
        int zenbakia;

        /*ALDAGAIAK ESKATU */
        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbaki bat (1-10): ");
        zenbakia = in.nextInt();
        in.close();

        /*BUKLEA EGIN, 1ETIK 49ARTEKO ZENBAKIAK INPRIMATZEKO, SARTUTAKO ZENBAKIAREN MULTIPLOAK DIRENAK IZAN EZIK */
        for (int i = 1; i < 50; i++) {
            if (i % zenbakia == 0) {
                System.out.print("* - ");
            } else {
                System.out.print(i + " - ");
            }
        }

        /*50 ZENBAKIA BEREZIA DENEZ (EZ DAUKA MARRATXORIK ONDOREN), BUKLEAREN ONDOREN JARRIKO DUGU */
        if (50 % zenbakia == 0) {
            System.out.print("*");
        } else {
            System.out.print("50");
        }
    }
}
