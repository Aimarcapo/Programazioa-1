import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        Laukia l1 = new Laukia();

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu laukiaren zabalera: ");
        l1.setZabalera(in.nextInt());
        System.out.print("Sartu laukiaren altuera: ");
        l1.setAltuera(in.nextInt());
        in.close();

        System.out.println("Lauki " + l1.getMota() + " sortu duzu: => " + l1);

        System.out.println("Hona marrazkia beteta:");

        for(int y = 0; y < l1.getAltuera(); y++){
            for (int x = 0; x < l1.getZabalera(); x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("Hona marrazkia hutsik:");

        for(int y = 1; y <= l1.getAltuera(); y++){
            if(y==1 || y==l1.getAltuera()){
                for(int x = 1; x <= l1.getZabalera(); x++){
                    System.out.print("* ");
                }
            } else {
                for (int x = 1; x <= l1.getZabalera(); x++) {
                    if(x==1 || x==l1.getZabalera()){
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
