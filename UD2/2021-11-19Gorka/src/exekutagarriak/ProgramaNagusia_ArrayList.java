package exekutagarriak;

import model.Liburua;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramaNagusia_ArrayList {

    private static ArrayList<Liburua> liburuak;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        liburuak = Liburua.getLiburuenArrayLista();

        int[] aukera = {-1, 0, 1, 2, 3, 4, 5};
        int aukZenb = 0;
        /*Hemen ez da beharrezkoa salbuespenen kudeaketa egitea, do-while batekin eginda dagoelako */   
            boolean egia = false;   
            do {
                try {
                    System.out.println();
                    System.out.println("LIBURUTEGIA");
                    System.out.println("====================================");
                    System.out.println("-1.- Liburua gehitu");
                    System.out.println("0.- Liburua kendu");
                    System.out.println("1.- Liburuen zerrenda sinplea ikusi");
                    System.out.println("2.- Liburuen datu guztiak ikusi");
                    System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
                    System.out.println("4.- Liburu zaharrena bilatu");
                    System.out.println("5.- Irten");
                    System.out.println("");
                    System.out.print("Aukeratu zenbaki bat: ");
                    aukZenb = (in.nextInt()+1);          
                    System.out.println("");
                    switch (aukera[aukZenb]) {
                        case -1:
                            liburuaGehitu(liburuak);
                            break;
                        case 0:
                            System.out.print("Zein posiziotako liburua kendu nahi duzu? ");
                            int posizioa = in.nextInt();
                            liburuaKendu(liburuak, posizioa);
                            break;
                        case 1:
                            liburuakIkusi();
                            break;
                        case 2:
                            liburuenDatuGuztiakIkusi();
                            break;
                        case 3:
                            liburuenPrezioaIrudikatu();
                            break;
                        case 4:
                            zaharrenaBilatu();
                            break;
                        case 5:
                            System.out.println("Eskerrik asko programa hau erabiltzearren.");
                            break;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("");
                    System.out.println("Zenbaki bat sartu behar duzu.");
                    in.next();
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Zenbaki okerra sartu duzu, aukerak -1-etik 5-era dira.");
                } catch (Exception ex) {
                    System.out.println("Salbuespena gertatu da.");
                    System.out.println(ex.getMessage());
                }
                if(aukera[aukZenb] == 5){
                    break;
                }
            } while (!egia);
        in.close();
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        for (int i = 0; i < liburuak.size(); i++) {
            System.out.println(liburuak.get(i));            
        }
    }

    public static void liburuenDatuGuztiakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        // ...
        double batazbestekoa = 0;
        int x = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int i = 0; i < liburuak.size(); i++) {
            System.out.printf("%-3d %-30s %-20s %4d %4d %-11s %1s %-6.2f %-15s\n", (i+1), liburuak.get(i).getIzenburua(), liburuak.get(i).getEgilea(), liburuak.get(i).getOrriKopurua(), liburuak.get(i).getUrtea(), liburuak.get(i).getGaia(), liburuak.get(i).getHizkuntza(), liburuak.get(i).getPrezioa(), liburuak.get(i).getKodea());
            x++;
            batazbestekoa += liburuak.get(i).getOrriKopurua();
        }
        batazbestekoa = batazbestekoa/x;

        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.printf("%30sLiburuen batez besteko orri kopurua: %.2f \n", " ", batazbestekoa);
    }

    public static void liburuenPrezioaIrudikatu() {
        //METODO HAU OSATU BEHAR DUZU
        for (int i = 0; i < liburuak.size(); i++) {
            System.out.printf("%35s:%s\n", liburuak.get(i).getIzenburua(), liburuak.get(i).getPrezioaIzartxotan()); 
        }
    }

    public static void zaharrenaBilatu() {
        //METODO HAU OSATU BEHAR DUZU
        int zaharrena = liburuak.get(0).getUrtea();
        int liburua = 0;
        for (int i = 0; i < liburuak.size(); i++) {
            if(liburuak.get(i).getUrtea()<zaharrena){
                zaharrena = liburuak.get(i).getUrtea();
                liburua = i;
            }
        }
        System.out.println("Liburu zaharrena " + zaharrena + " urtean argitaratu zen: " + liburuak.get(liburua));
    }

    public static void liburuaGehitu(ArrayList<Liburua> liburuak){
        /*Ez du lagatzen nextln()-a egitea, justo goia scanner-a sortzen ez bada. scanner-a ixten baduzu, gero, aukera
         * berri bat aukeratzean (menukoa), errorea ematen du*/
        Scanner in = new Scanner(System.in);
        liburuak.add(new Liburua("X", "X", 1, 1, "X", 'X', 1));
        System.out.print("Sartu izenburua: ");
        liburuak.get(liburuak.size()-1).setIzenburua(in.nextLine());
        System.out.print("Sartu egilea: ");
        liburuak.get(liburuak.size()-1).setEgilea(in.nextLine());
        System.out.print("Sartu orri kopurua: ");
        liburuak.get(liburuak.size()-1).setOrriKopurua(in.nextInt());
        System.out.print("Sartu urtea: ");
        liburuak.get(liburuak.size()-1).setUrtea(in.nextInt());
        System.out.print("Sartu gaia: ");
        liburuak.get(liburuak.size()-1).setGaia(in.next());
        System.out.print("Sartu hizkuntza: ");
        liburuak.get(liburuak.size()-1).setHizkuntza(in.next().charAt(0));
        System.out.print("Sartu prezioa: ");
        liburuak.get(liburuak.size()-1).setPrezioa(in.nextDouble());
    }

    public static void liburuaKendu(ArrayList<Liburua> liburuak, int posizioa){
        liburuak.remove(posizioa-1);
        System.out.println("Listo, kenduta!");
    }
}
