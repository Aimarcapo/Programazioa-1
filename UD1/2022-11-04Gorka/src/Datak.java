/*Erabiltzaileari data bat zehazteko eskatu ondoren, data hori formatu laburrean eta gero luzean inprimatuko ditu programa honek */

import java.util.Scanner;

public class Datak {
    public static void main(String[] args) {
        /*ALDAGAIAK SORTU ("emaitza" HASIERATU DUT, LEHENENGO BUELTAN BUKLEAN SARTZEKO, BAINA ERE EGIN AHALKO ZEN DO-WHILE MOTATAKO BUKLE BATEKIN) */
        int urtea, hilabetea, eguna;
        String emaitza = "B";

        /*ALDAGAIAK ESKATU */
        Scanner in = new Scanner(System.in);

        /*BUKLE BAT, PROGRAMA HAU EXEKUTATZEKO ERABILTZAILEA NAHI DUEN BITARTEAN ("E" SARTU ARTE) */
        for (int i = 1; emaitza.equals("B"); i++) {
            System.out.println(i + ". DATA:");

            System.out.print("   Urtea: ");
            urtea = in.nextInt();
            System.out.print("   Hilabetea: ");
            hilabetea = in.nextInt();
            System.out.print("   Eguna: ");
            eguna = in.nextInt();

            System.out.println("   Data formatu laburrean: " + dataLaburra(urtea, hilabetea, eguna));
            System.out.println("   Data formatu luzean: " + dataLuzea(urtea, hilabetea, eguna));

            System.out.print("   Beste data bat sartu nahi duzu (B/E) ? ");
            emaitza = in.next();

            /*BUKLETIK IRTETEKO EMAITZA "E"(EZ) BADA */
            if (emaitza.equals("E")) {
                break;
            }
        }

        in.close();
    }
    /*METODOAK */

    /*DATA LABURRA ERAKUSTEKO METODOA */
    public static String dataLaburra(int urtea, int hilabetea, int eguna) {

        String laburra = urtea + "-" + hilabetea + "-" + eguna;

        return laburra;
    }

    /*DATA LUZEA ERAKUSTEKO METODOA */
    public static String dataLuzea(int urtea, int hilabetea, int eguna) {
        String luzea = "A";

        /*SWITCH-CASE-DEFAULT ERABILI DUT, HILABETE ZENBAKI BAKOITZAK, BERE IZENA DUELAKO, ETA ESTRUKTURA HAU, NESTED-IF BAINO ZEHATZAGOA IRUDITZEN ZAIDALAKO */
        /*ERE EGIN AHALKO ZEN ARRAY BATEN HILABETEEN IZENAK SARTZEN, ETA GERO POSIZIOAREN ARABERA HILABETE ZENBAKIA IZENDATZEN, BAINA ULERTZEKO KONPLEXUAGOA DA */
        switch (hilabetea) {
            case 1:
                luzea = urtea + "ko Urtarrilaren " + eguna + "a";
                break;
            case 2:
                luzea = urtea + "ko Otsailaren " + eguna + "a";
                break;
            case 3:
                luzea = urtea + "ko Martxoaren " + eguna + "a";
                break;
            case 4:
                luzea = urtea + "ko Apirilaren " + eguna + "a";
                break;
            case 5:
                luzea = urtea + "ko Maiatzaren " + eguna + "a";
                break;
            case 6:
                luzea = urtea + "ko Ekainaren " + eguna + "a";
                break;
            case 7:
                luzea = urtea + "ko Uztailaren " + eguna + "a";
                break;
            case 8:
                luzea = urtea + "ko Abuztuaren " + eguna + "a";
                break;
            case 9:
                luzea = urtea + "ko Irailaren " + eguna + "a";
                break;
            case 10:
                luzea = urtea + "ko Urriaren " + eguna + "a";
                break;
            case 11:
                luzea = urtea + "ko Azaroaren " + eguna + "a";
                break;
            case 12:
                luzea = urtea + "ko Abenduaren " + eguna + "a";
                break;
        }

        return luzea;
    }
}
