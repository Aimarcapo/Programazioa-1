import java.util.Scanner;
import java.util.Arrays;

public class AriketaGehigarriakTester {
    public static void main(String[] args) {
        int kont;
        Laukia[] laukiak;

        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat karratu nahi dituzu?  ");
        kont = in.nextInt();

        laukiak = new Laukia[kont];
        
        for(int i = 0; i<laukiak.length; i++){

            System.out.println(i+1 + ". LAUKIAREN DATUAK:");
            
            laukiak[i] = new Laukia();

            System.out.print("Zabalera: ");
            laukiak[i].setZabalera(in.nextInt());
            System.out.print("Altuera: ");
            laukiak[i].setAltuera(in.nextInt());
            System.out.println("");
        }

        //ARIKETA GEHIGARRIAK FORGATZEKO:
        ordenatu(laukiak);
        System.out.println("");
        handitu(laukiak[0], 2);
        System.out.println("");

        in.close();
    }

    /**Lauki array bat txikienetik handieneta ordenatzeko BubleSort ariketan oinarrituta */
    public static void ordenatu(Laukia[] laukiak){
        
        for (int a = 0; a < laukiak.length; a++) {
            for (int i = 0; i < laukiak.length-1; i++) {
                if(laukiak[i].getAzalera() > laukiak[i+1].getAzalera()){
                    Laukia kopia = laukiak[i];
                    laukiak[i]=laukiak[i+1];
                    laukiak[i+1]=kopia; 
                }
            }
        }
        System.out.println(Arrays.toString(laukiak));
    }

    /**Lauki bat proportzionalki handitzeko */
    public static void handitu(Laukia l, int tamaina){
        l.setAltuera(l.getAltuera()*tamaina);
        l.setZabalera(l.getZabalera()*tamaina);
        System.out.println(l);
    }
}
