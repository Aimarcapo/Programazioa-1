package exekutagarriak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.Futbolista;
import model.IntegranteSeleccion;
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
        System.out.println("Partida baten datuak sartu nahi dituzu (b/e)?");
        erantzuna = in.next().charAt(0);
        while(erantzuna == 'b'){
            partidak[partidaPosizio++] = partidaBatenDatuakEskatu();
            System.out.println("Partida baten datuak sartu nahi dituzu (b/e)?");
            erantzuna = in.next().charAt(0);
        }
        partidakBistaratu();
        

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
        String aurkaria;
        ArrayList<Futbolista> txartelak = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Noiz jokatu zen (uuuu-hh-ee)? ");
        LocalDate data = LocalDate.parse(in.next());
        System.out.println(data);
        System.out.print("Noren kontra? ");
        aurkaria = in.next();

        Partida partida = new Partida(data, aurkaria, new ArrayList());
        
        System.out.print("Selekzioko jokalariaren batek jaso al zuen txartelik? (Sartu dortsalak, komaz banatuta edo sakatu ENTER) ");
        String[] dorsalak = in.next().split(",");
        for (int i = 0; i < dorsalak.length; i++) {
            partida.txartelaJarri(bilatuDortsaletik(Integer.parseInt(dorsalak[i])));
        }
        return partida;
    }


    public static void partidakBistaratu(){
        System.out.println("\nPARTIDEN ZERRENDA\n-----------------------------------");
        for (int i = 0; i < partidak.length; i++) {
            if(partidak[i] != null){
                System.out.println(partidak[i]);
            }
        }
    }

/*
    public static void estatistikak(){
        System.out.println("\nESTATISTIKAK\n-----------------------------------");
        System.out.println("Jokatutako partida kopurua: " + partidak.size());
        System.out.println("Txartelak daukaten jokalariak:");
        for (int i = 0; i < euskalSelekzioa.selekzioa.size(); i++) {
            int txartelak;
            for (int j = 0; j < partidak.size(); j++) {
                for (int j2 = 0; j2 < partidak.get(j).getTxartelak().size(); j2++) {
                    if(partidak.get(j).getTxartelak(j2) == euskalSelekzioa.selekzioa.get(i)){

                    }
                }
            }
        }
    }
*/
}
