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
    private static ArrayList<Partida> partidak = new ArrayList<>();

    public static void main(String[] args) {
        
    }

    public static int hasierakoPartidakErregistratu(){
        return 1;
    }

    public static Partida partidaBatenDatuakEskatu(){
        LocalDate data;
        String aurkaria;
        ArrayList<Futbolista> txartelak = new ArrayList<>();
        Partida partida = new Partida(null, null, null);
        Scanner in = new Scanner(System.in);

        System.out.print("Noiz jokatu zen (uuuu-hh-ee)? ");
        data = in.next();
        System.out.print("Noren kontra? ");
        aurkaria = in.next();
        System.out.print("Selekzioko jokalariaren batek jaso al zuen txartelik? (Sartu dortsalak, komaz banatuta edo sakatu ENTER) ");
    
        return partida;
    }

    public static void partidakBistaratu(){
        System.out.println("\nPARTIDEN ZERRENDA\n-----------------------------------");
        for (int i = 0; i < partidak.size(); i++) {
            System.out.println(partidak.get(i));
        }
    }

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
}
