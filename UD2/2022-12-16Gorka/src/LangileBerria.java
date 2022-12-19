import java.util.ArrayList;
import java.util.Scanner;


/** Programa honek langile berri bat txertatuko du zerrendan. Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Erabiltzaileari langile berriaren datuak eskatu eta 
 * 4.- Langilea sortu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerria {
    public static void main(String[] args) {
        //OSATU EZAZU METODO HAU
        Scanner in = new Scanner(System.in);

        //Langileen zerrenda eskuratu
        ArrayList<Langilea> lk = Langilea.getLangileenZerrenda();
        //Langileen zerrenda inprimatu
        Langilea.langileakInprimatu(lk);

        //Erabiltzaileari langile berriaren datuak eskatu eta langilea sortu
        System.out.println("");
        System.out.print("Langile berriaren izen abizenak idatzi espazioz bananduta: ");
        lk.add(new Langilea(in.next(), in.next()));
        System.out.println("");

        //Langilea zerrendan txertatu eta langileen zerrenda inprimatu (langile berria zuzenean txertatzen da zerrendan, izan ere, langilea, add metodoarekin ArrayListan
        // sortzen dugu, eta inprimatzeko, zuzenean ArrayLista erabiltzen dugu)
        Langilea.langileakInprimatu(lk);

        in.close();
    }    
}
