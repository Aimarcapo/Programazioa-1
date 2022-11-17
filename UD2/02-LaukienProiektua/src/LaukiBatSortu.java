import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        Laukia l1 = new Laukia();
        char ikurra;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu laukiaren zabalera: ");
        l1.setZabalera(in.nextInt());
        System.out.print("Sartu laukiaren altuera: ");
        l1.setAltuera(in.nextInt());

        System.out.println("Lauki " + l1.getMota() + " sortu duzu: => " + l1);

        System.out.println("Hona marrazkia beteta:");
        l1.marraztuBeteta();
        
        System.out.println("Hona marrazkia hutsik:");
        l1.marraztuHutsik();

        System.out.print("Zein ikurrekin nahi duzu laukia bete? ");
        ikurra = in.next() .charAt(0);
        l1.marraztuBeteta(ikurra);

        System.out.println();

        System.out.println("Orain laukiBetea metodoari deituta: ");
        System.out.println(l1.laukiBetea());

        in.close();
    }
}