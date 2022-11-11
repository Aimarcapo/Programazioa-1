import java.util.Scanner;

public class LaukiAskoSortu {
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
        }
        
        in.close();

        System.out.printf("Laukia %10s %10s %10s %10s %15s \n", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("=========================================================================================================");
        
        for(int i = 0, x=1; i<laukiak.length; i++, x++){
            System.out.printf("%5d %10d %10d %10d %10d %15s \n", x, laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota() );
        }
    }
}
