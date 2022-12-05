package salbuespenak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog4 {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner in = new Scanner(System.in);
        int zenbatgarren;
        try {
            System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarren = in.nextInt();
            System.out.println(zenbakiak[zenbatgarren]);
        } catch (InputMismatchException ex) {
            System.out.println("Zenbaki bat sartu behar duzu.");
            in.next(); //scannerrean geratu dan elementua hustuteko
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Zenbaki okerra sartu duzu.");
        } catch (Exception ex) { //hona sartuko da baldin eta gertatuko exception-a ez bada InputMismatch edo ArrayIndexOutOfBounds
            System.out.println("Salbuespena gertatu da. Baina ez da ez InputMismatch-a ezta ArrayIndex klasekoa");
            System.out.println(ex.getMessage());
        } finally { // Bloke hau beti exekutatuko da, exceptiona gertatu ala gertatu ez.
            System.out.println("Agur.");
        }

        in.close();
    }    
}
