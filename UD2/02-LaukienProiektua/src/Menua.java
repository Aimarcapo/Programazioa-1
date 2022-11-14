import java.util.Scanner;

public class Menua {
    private static int LAUKI_KOP = 10;
    private static int sortutakoak = 0;
    private static Laukia[] laukiak;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Irten");
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
        laukiak = new Laukia[LAUKI_KOP];
        int zab, alt;

        if (sortutakoak <= 10) {
            System.out.println("LAUKI BERRIA SORTZEN");

            System.out.print("Sartu zabalera: ");
            zab = in.nextInt();
            System.out.println();
            System.out.print("Sartu altuera: ");
            alt = in.nextInt();
            System.out.println();

            laukiak[sortutakoak] = new Laukia(zab, alt);
            sortutakoak++;

            System.out.println("...");

        } else {
            System.out.println("Ezin dituzu lauki gehiago sortu.");
        }
    }

    /**Laukien datuak inprimatzeko metodoa */
    public static void inprimatu() {
        System.out.printf("Laukia %10s %10s %10s %10s %15s \n", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("=========================================================================================================");
        
        for(int i = 0, x=1; i<laukiak.length; i++, x++){
            System.out.printf("%5d %10d %10d %10d %10d %15s \n", x, laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota() );
        }
        System.out.println("");
        System.out.println("...");
    }

    /**Lauki bat marrazteko metodoa */
    private static void marraztu() {
        System.out.print("Zer karratu marraztu nahi duzu? ");
        int index = in.nextInt()-1;
        System.out.print("Beteta ala hutsik (B/H)? ");
        String erantzuna = in.next();

        if(erantzuna.equals("B")){
            for(int y = 0; y < laukiak[index].getAltuera(); y++){
                for (int x = 0; x < laukiak[index].getZabalera(); x++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        } else if(erantzuna.equals("H")){
            for(int y = 1; y <= laukiak[index].getAltuera(); y++){
                if(y==1 || y==laukiak[index].getAltuera()){
                    for(int x = 1; x <= laukiak[index].getZabalera(); x++){
                        System.out.print("* ");
                    }
                } else {
                    for (int x = 1; x <= laukiak[index].getZabalera(); x++) {
                        if(x==1 || x==laukiak[index].getZabalera()){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                
                System.out.println("");
            }
        }        
    }  
    
    /**Arrayaren lauki handiena topatzeko metodoa */
    public static void handiena(){

        Laukia handiena = new Laukia();

        handiena = Laukia.getTheBiggest(laukiak);

        System.out.println( "Laukirik handiena hay da: " + handiena.toString());

    }
}
