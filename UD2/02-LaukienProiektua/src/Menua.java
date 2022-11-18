import java.util.Arrays;
import java.util.Scanner;

public class Menua {
    private static final int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int aukera = 0;
        laukiak = new Laukia[LAUKI_KOP];
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Arraya automatikoki bete");
            System.out.println("6.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    System.out.println("");
                    sortu();
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    System.out.println("");
                    inprimatu();
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    System.out.println("");
                    marraztu();
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    System.out.println("");
                    handiena();
                    break;
                case 5:
                    System.out.println("Bostgarren aukera aukeratu duzu.");
                    System.out.println("");
                    arrayaBete(laukiak);
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);

        in.close();
    }

    //MENURAKO METODOAK
    /**Lauki bat sortzeko metodoa */
    public static void sortu() {

        if (sortutakoak < 10) {
            System.out.println("LAUKI BERRIA SORTZEN");

            laukiak[sortutakoak] = new Laukia();

            System.out.print("Sartu zabalera: ");
            laukiak[sortutakoak].setZabalera(in.nextInt());
            System.out.println();
            System.out.print("Sartu altuera: ");
            laukiak[sortutakoak].setAltuera(in.nextInt());
            System.out.println();

            sortutakoak++;

            System.out.println("...");

        } else {
            System.out.println("Ezin dituzu lauki gehiago sortu.");
        }
    }

    /**Laukien datuak inprimatzeko metodoa */
    public static void inprimatu() {
        int kopia = sortutakoak;
        
        System.out.printf("Laukia %10s %10s %10s %10s %15s \n", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("=========================================================================================================");
        
        for(int x=1, sortutakoak=0; sortutakoak < kopia; sortutakoak++, x++){
            System.out.printf("%5d %10d %10d %10d %10d %15s \n", x, laukiak[sortutakoak].getZabalera(), laukiak[sortutakoak].getAltuera(), laukiak[sortutakoak].getAzalera(), laukiak[sortutakoak].getPerimetroa(), laukiak[sortutakoak].getMota() );
        }
        System.out.println("");
        System.out.println("...");

        sortutakoak = kopia;
    }

    /**Lauki bat marrazteko metodoa */
    private static void marraztu() {

        System.out.print("Zer karratu marraztu nahi duzu? ");
        int index = in.nextInt()-1;
        System.out.print("Beteta ala hutsik (B/H)? ");
        String erantzuna = in.next();

        if(erantzuna.equals("B")){
            laukiak[index].marraztuBeteta();
        } else if(erantzuna.equals("H")){
            laukiak[index].marraztuHutsik();
        }        
    }  
    
    /**Arrayaren lauki handiena topatzeko metodoa */
    public static void handiena(){

        Laukia handiena = new Laukia();

        handiena = Laukia.getTheBiggest(laukiak);

        System.out.println( "Laukirik handiena hau da: " + handiena.toString());

    }

    /**Array bat automatikoki betetzeko metodoa. Ausazko baloreak hartuko dute. */
    public static void arrayaBete(Laukia[] laukiak){
        for (int i = 0; i < laukiak.length; i++) {
            laukiak[i]= new Laukia((int)(Math.random()*10+1), (int)(Math.random()*10+1));
        }
        System.out.println("Sortu duzun arraya: ");
        System.out.println(Arrays.toString(laukiak));
    }
}
