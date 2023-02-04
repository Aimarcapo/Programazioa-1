package exekutagarriak;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.Futbolista;
import model.Partida;
import model.Selekzioa;

public class PartidakKudeatu {
    private static Selekzioa euskalSelekzioa = new Selekzioa();
    private static Partida[] partidak = new Partida[200];
    private static int partidaPosizio = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selekzioa sortu ondoren " + euskalSelekzioa.getSelekzioa().size() + " jokalari dauzkagu.");
        hasierakoPartidakErregistratu();
        char erantzuna;
        while(true){
            System.out.println("Partida baten datuak sartu nahi dituzu (b/e)?");
            erantzuna = in.next().charAt(0);
            switch(erantzuna){
                case 'b':
                    partidak[partidaPosizio++] = partidaBatenDatuakEskatu();
                    continue;
                case 'e': 
                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia...");
                    continue;
            }
            if(erantzuna == 'e'){
                break;
            }
        }
        partidakBistaratu();
        estatistikak();
    }

    public static void hasierakoPartidakErregistratu(){
        partidak[partidaPosizio++] = new Partida(LocalDate.of(1990, 03, 21), "Errumania", new ArrayList<>());
        partidak[partidaPosizio++] = new Partida(LocalDate.of(1993, 12, 22), "Bolivia", new ArrayList<>());
        partidak[partidaPosizio++] = new Partida(LocalDate.of(1994, 12, 22), "Rusia", new ArrayList<>());
        partidak[partidaPosizio++] = new Partida(LocalDate.of(1995, 12, 22), "Paraguay", new ArrayList<>());
        partidak[partidaPosizio++] = new Partida(LocalDate.of(1996, 12, 26), "Estonia", new ArrayList<>());
        System.out.println("Lehen 5 partidak erregistratu dira.");
    }


    public static Partida partidaBatenDatuakEskatu(){
        ArrayList<Futbolista> txartelak = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Noiz jokatu zen (uuuu-hh-ee)? ");
        LocalDate data = LocalDate.parse(in.next());
        System.out.print("Noren kontra? ");
        String aurkaria = in.next();

        Partida partida = new Partida(data, aurkaria, txartelak);
        
        System.out.print("Selekzioko jokalariaren batek jaso al zuen txartelik? (Sartu dortsalak, komaz banatuta edo sakatu ENTER) ");
        String[] dorsalak = in.next().split(",");
        for (int i = 0; i < dorsalak.length; i++) {
            partida.txartelaJarri(Futbolista.bilatuDortsaletik(Integer.parseInt(dorsalak[i])));
        }
        return partida;
    }


    public static void partidakBistaratu(){
        System.out.println("\nPARTIDEN ZERRENDA\n-----------------------------------");
        for (int i = 0; i < partidak.length; i++) {
            if(partidak[i] != null){
                System.out.println((i+1) + ". " + partidak[i]);
            }
        }
    }


    public static void estatistikak(){
        System.out.println("\nESTATISTIKAK\n-----------------------------------");
        /*PARTIDA KOPURUA */
        int kopurua = 0;
        for (int i = 0; i < partidak.length; i++) {
            if(partidak[i] != null){
                kopurua++;
            }
        }
        System.out.println("Jokatutako partida kopurua: " + kopurua);
        System.out.println("");

        /*TXARTEL GEHIEN DUEN PARTIDA */
        Partida gogorrena = partidak[0];
        for (int i = 1; i < partidak.length; i++) {
            if(partidak[i] != null){
                if(partidak[i].getTxartelak().size() > gogorrena.getTxartelak().size()){
                    gogorrena = partidak[i];
                }
            }
        }
        System.out.println("Partida gogorrena: " + gogorrena);
        System.out.println("");

        /*PARTIDAK URTEKO */
        System.out.println("Urte bakoitzean jokatutako partida kopurua: ");
        for (int i = 0; i < partidak.length; i++) {
            if(partidak[i] != null){
                int count = 0;
                boolean errepikatu = false;
                for (int j = 0; j < partidak.length; j++) {
                    if(partidak[j] != null){
                        if(j < i){
                            if(partidak[i].getData().getYear() == partidak[j].getData().getYear()){
                                errepikatu = true;
                                break;
                            }
                        }
                    }
                    if(errepikatu){
                        break;
                    }
                }
                if(!errepikatu){
                    for (int j = 0; j < partidak.length; j++) {
                        if(partidak[j] != null){
                            if(partidak[i].getData().getYear() == partidak[j].getData().getYear()){
                                count++;
                            }
                        }
                    }
                    System.out.println(partidak[i].getData().getYear() + ": " + count);
                }
                
            }
        }
        System.out.println("");

        /*LEHENENGO PARTIDA */
        Partida lehenengoa = partidak[0];
        for (int i = 1; i < partidak.length; i++) {
            if(partidak[i] != null){
                if(partidak[i].getData().getYear() < lehenengoa.getData().getYear()){
                    lehenengoa = partidak[i];
                }
            }
        }
        System.out.println("Jokatutako lehen partida: " + lehenengoa);
        System.out.println("Orain dela " + (2023-lehenengoa.getData().getYear()) + " urte jolastu zen.");
        System.out.println("");

        /*PARTIDA HILABETEKO */
        System.out.println("Hilabete bakoitzean jokatutako partida kopuruen portzentaia: ");
        for (int i = 0; i < partidak.length; i++) {
            if(partidak[i] != null){
                int count = 0;
                boolean errepikatu = false;
                for (int j = 0; j < partidak.length; j++) {
                    if(partidak[j] != null){
                        if(j < i){
                            if(partidak[i].getData().getMonth() == partidak[j].getData().getMonth()){
                                errepikatu = true;
                                break;
                            }
                        }
                    }
                    if(errepikatu){
                        break;
                    }
                }
                if(!errepikatu){
                    for (int j = 0; j < partidak.length; j++) {
                        if(partidak[j] != null){
                            if(partidak[i].getData().getMonth() == partidak[j].getData().getMonth()){
                                count++;
                            }
                        }
                    }
                    Double portzentaia = (((double)count)/((double)kopurua)*100);
                    //getDisplayName() hilabeteak euskeraz jartzeko, faltan lehenengo hizkia larriz, eta -k gabe.
                    System.out.println(partidak[i].getData().getMonth().getDisplayName(TextStyle.FULL, new Locale("eu","ES")) + ": (" + count + " partida) %" + portzentaia);
                }
                
            }
        }
        System.out.println("");

        /*TXARTEL KOPURUA JOKALARIKO */
        /*EGITEKE */
        System.out.println("Selekzioko jokalari bakoitzak duen txartel kopurua: ");
        //FOR-IF HAU JOKALARI BAKOITZETIK JOATEKO
        for (int i = 0; i < euskalSelekzioa.getSelekzioa().size(); i++) {
            if(euskalSelekzioa.getSelekzioa().get(i) instanceof Futbolista){
                int count = 0;
                //FOR-IF HAU PARTIDA BAKOITZETIK JOATEKO
                for (int j = 0; j < partidak.length; j++) {
                    if(partidak[j] != null){
                        //FOR-IF HAU TXARTELETIK JOATEKO
                        for (int j2 = 0; j2 < partidak[j].getTxartelak().size(); j2++) {
                            if(partidak[j].getTxartelak().get(j2).getId() == (euskalSelekzioa.getSelekzioa().get(i).getId())){
                                count++;
                                break;
                            }
                        }
                    }
                }
                System.out.println(euskalSelekzioa.getSelekzioa().get(i).getNombre() + " " + euskalSelekzioa.getSelekzioa().get(i).getApellidos() + ": " + count);
                //BAKARRIK TXARTELIK DUEN JOKALARIAK ERAKUSTEKO, BAINA 
                //EZ BADAGO TXARTELDUN JOKALARIRIK, HUTSIK AGERTUKO ZEN
                /*if(count>0){
                    System.out.println(euskalSelekzioa.getSelekzioa().get(i).getNombre() + " " + euskalSelekzioa.getSelekzioa().get(i).getApellidos() + ": " + count);
                }*/
            }
        }
    }
}
