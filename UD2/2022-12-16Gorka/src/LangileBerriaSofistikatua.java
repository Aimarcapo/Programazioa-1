import java.util.ArrayList;
import java.util.Scanner;

/** Programa honek langile berri bat txertatuko du zerrendan. 
 * Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Langile berria eskuratu (datuakEskatu metodoari deituta)
 * 4.- Langile berriaren emaila ez bada egokia (errepikatuta dagoelako) emaila ajustatu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerriaSofistikatua {
    public static void main(String[] args) {
        //OSATU EZAZU METODO HAU
        //Langileen zerrenda eskuratu
        ArrayList<Langilea> lk = Langilea.getLangileenZerrenda();

        //Langileen zerrenda inprimatu
        Langilea.langileakInprimatu(lk);

        //Langile berria eskuratu
        System.out.println("");
        Langilea langileBerria = datuakEskatu();
        if(!langileBerria.emailEgokia(lk)){
            langileBerria.emailaDoitu();
        }
        lk.add(langileBerria);
        System.out.println("");

        //Langileen zerrenda inprimatu
        Langilea.langileakInprimatu(lk);

    }

    /** Metodo honek langile berri baten datuak eskatzen dizkio erabiltzaileari.
     * Ez badu soldata zenbakitan, behar bezala sartzen, 1200eko soldata asignatuko zaio.
     * 
     * @return Langile berria
     */
    public static Langilea datuakEskatu() {
        Scanner in = new Scanner(System.in);
        Langilea langilea = new Langilea("x", "x");
        //OSATU EZAZU METODO HAU
        System.out.println("LANGILE BERRIA");
        System.out.printf("%-3s %-5s", "", "Izena: ");
        langilea.setIzena(in.next());
        System.out.printf("%-3s %-5s", "", "Abizena: ");
        langilea.setAbizena(in.next());
        System.out.printf("%-3s %-5s", "", "Emaila: ");
        langilea.setEmaila(in.next());
        try{
            System.out.printf("%-3s %-5s", "", "Soldata: ");
            langilea.setSoldata(in.nextDouble());
        } catch (Exception ex){
            System.out.println("Soldata ezegokia sartu duzu, beraz, lehenetsia esleiuko diogu.");
            langilea.setSoldata(1200.0);
        }
        in.close();        
        return langilea;
    }

}
