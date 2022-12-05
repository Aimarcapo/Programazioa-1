package salbuespenak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog5 {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner sc = new Scanner(System.in);
        int zenbatgarren;
        boolean egina = false;
        do {
            try {

                System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
                zenbatgarren = sc.nextInt();
                System.out.println(zenbakiak[zenbatgarren]);
                egina = true;
            } catch (InputMismatchException ex) {
                System.out.println("Zenbaki bat sartu behar duzu.");
                sc.next(); //scannerrean geratu dan elementua hustuteko
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Zenbaki okerra sartu duzu.");
            } catch (Exception ex) {
                System.out.println("Salbuespena gertatu da.");
                System.out.println(ex.getMessage());
            }

        } while (!egina);
        sc.close();
    }


}