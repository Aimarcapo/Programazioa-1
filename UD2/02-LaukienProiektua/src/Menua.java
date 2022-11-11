import java.util.Scanner;

public class Menua {
    public static void main(String[] args) {
        int erantzuna = 0;

        Scanner in = new Scanner(System.in);

        while(erantzuna != 5){
                
            System.out.println("LAUKIAK");
            System.out.println("=======================================");
            System.out.println("1.- Lauki berria sortu.");
            System.out.println("2.- Laukien taula ikusi.");
            System.out.println("3.- Lauki bat marraztu.");
            System.out.println("4.- Lauki handiena bilatu.");
            System.out.println("5.- Irten.");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            
            erantzuna = in.nextInt();
            System.out.println("");
            System.out.println("");

        }
        in.close();
    }
}
