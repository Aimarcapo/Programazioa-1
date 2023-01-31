package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;

import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

public class EuskalSelekzioaMenua {
    public static void main(String[] args) {
        int aukera = 0;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("MENUA\n-------------------------------");
            System.out.println("1. Partaideen datuak ikusi.");
            System.out.println("2. Partaideen datuak ikusi taldekatuta.");
            System.out.println("3. Partaideak alfabetikoki inprimatu.");
            System.out.println("4. Aldaketa.");
            System.out.println("5. Bilatu abizenetik.");
            System.out.println("6. Futbolariak alfabetikoki inprimatu.");
            System.out.println("\n20. Irten\n");

            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();

            switch(aukera){
                case 1:
                    datuakIkusi();
                    break;
                case 2:
                    datuakIkusiTaldekatuta();
                    break;
                case 3:
                    partaideakAlfabetikokiIkusi();
                    break;
                case 4: 
                    aldaketa();
                    break;
                case 5:
                    break;
                case 6:
                case 20:
                    break;
                default:
                    System.out.println("Sartutako aukera ez da egokia...");
            }

        } while(aukera != 20);
        System.out.println("Eskerrik asko nire menua erabiltzeagatik!");
        in.close();
    }

    public static void datuakIkusi(){
        EuskalSelekzioa.selekzioOsoaSortu();
        int countFut = 0, countEntr = 0, countMas = 0, countBest = 0;
        System.out.println();
        for (int index = 0; index < EuskalSelekzioa.selekzioa.size(); index++) {
            System.out.println(EuskalSelekzioa.selekzioa.get(index));
            if(EuskalSelekzioa.selekzioa.get(index).getClass() == Futbolista.class){
                countFut++;
            } else if(EuskalSelekzioa.selekzioa.get(index).getClass() == Entrenador.class){
                countEntr++;
            } else if(EuskalSelekzioa.selekzioa.get(index).getClass() == Masajista.class){
                countMas++;
            } else{
                countBest++;
            }
        }
        System.out.println("GUZTIRA: " + countFut + " futbolari, " + countEntr + " entrenatzaile, " + countMas + " masajista, eta " + countBest + " bestelakoak" );
        System.out.println("");
    }

    public static void datuakIkusiTaldekatuta(){
        EuskalSelekzioa.selekzioOsoaSortu();
        int count = 0;
        ArrayList<IntegranteSeleccion> fut = new ArrayList<>();
        ArrayList<IntegranteSeleccion> entre = new ArrayList<>();
        ArrayList<IntegranteSeleccion> mas = new ArrayList<>();
        ArrayList<IntegranteSeleccion> best = new ArrayList<>();

        for (int i = 0; i < EuskalSelekzioa.selekzioa.size(); i++) {
            if(EuskalSelekzioa.selekzioa.get(i).getClass() == Futbolista.class){
                fut.add(EuskalSelekzioa.selekzioa.get(i));
            } else if(EuskalSelekzioa.selekzioa.get(i).getClass() == Entrenador.class){
                entre.add(EuskalSelekzioa.selekzioa.get(i));
            } else if(EuskalSelekzioa.selekzioa.get(i).getClass() == Masajista.class){
                mas.add(EuskalSelekzioa.selekzioa.get(i));
            } else{
                best.add(EuskalSelekzioa.selekzioa.get(i));
            }
        }
        //FUTBOLARIAK
        System.out.println("");
        System.out.println("FUTBOLARIAK\n------------------");
        for (int i = 0; i < fut.size(); i++) {
            System.out.println(fut.get(i));
            count++;
        }
        System.out.println("GUZTIRA: " + count);
        count = 0;
        //ENTRENADOREAK
        System.out.println("");
        System.out.println("ENTRENATZAILEAK\n------------------");
        for (int i = 0; i < entre.size(); i++) {
            System.out.println(entre.get(i));
            count++;
        }
        System.out.println("GUZTIRA: " + count);
        count = 0;
        //MASAJISTAK
        System.out.println("");
        System.out.println("MASAJISTAK\n------------------");
        for (int i = 0; i < mas.size(); i++) {
            System.out.println(mas.get(i));
            count++;
        }
        System.out.println("GUZTIRA: " + count);
        count = 0;
        //BESTELAKOAK
        System.out.println("");
        System.out.println("BESTELAKOAK\n------------------");
        for (int i = 0; i < best.size(); i++) {
            System.out.println(best.get(i));
            count++;
        }
        System.out.println("GUZTIRA: " + count);
        System.out.println("");
    }
    
    //EGITEKE
    public static void futbolariakAlfabetikokiIkusi(){

    }

    //EGITEKE
    public static void partaideakAlfabetikokiIkusi(){
    
    }

    public static void aldaketa(){
        int id;
        String postua;
        EuskalSelekzioa.selekzioOsoaSortu();
        Scanner in = new Scanner(System.in);

        System.out.println("Zein jokalariaren posizioa aldatu nahi duzu (ID-a esan)?");
        id = in.nextInt();

        for (int i = 0; i < EuskalSelekzioa.selekzioa.size(); i++) {
            if(EuskalSelekzioa.selekzioa.get(i).getId() == id){
                System.out.println(((Futbolista)EuskalSelekzioa.selekzioa.get(i)).getDemarkazioa() + ", posizioan zengoen, zein posiziora aldatu nahi duzu (POR, DEF, MED, DEL)?");
                postua = in.next();
                switch(postua){
                    case "POR":
                        ((Futbolista)EuskalSelekzioa.selekzioa.get(i)).setDemarkazioa(Demarkazioa.POR);
                        System.out.println("Ondo aldatu da.");
                        break;
                    case "DEF":
                        ((Futbolista)EuskalSelekzioa.selekzioa.get(i)).setDemarkazioa(Demarkazioa.DEF);
                        System.out.println("Ondo aldatu da.");
                        break;
                    case "MED":
                        ((Futbolista)EuskalSelekzioa.selekzioa.get(i)).setDemarkazioa(Demarkazioa.MED);
                        System.out.println("Ondo aldatu da.");
                        break;
                    case "DEL":
                        ((Futbolista)EuskalSelekzioa.selekzioa.get(i)).setDemarkazioa(Demarkazioa.DEL);
                        System.out.println("Ondo aldatu da.");
                        break;
                    default:
                        System.out.println("Sartutako aukera ez da egokia.");
                }
            }
        }
        in.close();
    }
}
