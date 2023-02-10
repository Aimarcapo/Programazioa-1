package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;

import model.Erosketa;
import model.Pertsona;
import model.Produktua;

public class ErosketenKudeaketa {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Erosketa> erosketak = new ArrayList<>();
    public static void main(String[] args) {
        int erantzuna;
        do{
            System.out.println("*************************************************");
            System.out.println("EROSKETEN KUDEAKETA");
            System.out.println("------------------------------------------------");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("20. Irten");
            System.out.println("------------------------------------------------");

            System.out.print("Aukeratu zenbaki bat: ");
            erantzuna = in.nextInt();

            switch(erantzuna){
                case 1:
                    create();
                case 2:
                    readMenua();
                case 3:
                    update();
                case 4:
                    delete();
                case 20:
                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia.");
            }
        }while(erantzuna != 20);

        System.out.println("Eskerrik asko! Agur!");
    }

    public static void create(){
        ArrayList<Produktua> produktuak = new ArrayList<>();
        

        erosketak.add(new Erosketa("E18-01", "25-09-2018", new Pertsona(2, "Martin", "Berasategi", "mbera@donostia.eus", "Mirakontxa z/g. DDONOSTIA."), null, null, 3630));
    }

    public static void readMenua(){
        int erantzuna;
        do{
            System.out.println("*************************************************");
            System.out.println("READ MENUA");
            System.out.println("------------------------------------------------");
            System.out.println("1. Erosketen zerrenda");
            System.out.println("2. Fakturazio osoa");
            System.out.println("3. Bezerorik onena");
            System.out.println("4. Helbidea bilatu");
            System.out.println("5. Epekako erosketen txostena");
            System.out.println("20. Menu nagusira itzuli");
            System.out.println("------------------------------------------------");

            System.out.print("Aukeratu zenbaki bat: ");
            erantzuna = in.nextInt();

            switch(erantzuna){
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 20:
                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia.");
            }
        }while(erantzuna != 20);
    }

    public static void update(){

    }

    public static void delete(){
        char[] kodigoa;
        System.out.print("Zein erosketa borratu nahi duzu, esan bere kodigoa:");
        kodigoa = in.next().toCharArray();

        for (int i = 0; i < erosketak.size(); i++) {
            
        }
    }
}
