package salbuespenak;

import java.util.Scanner;

public class Prog3 {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner in = new Scanner(System.in);
        int zenbatgarren;
        try {
            System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarren = in.nextInt();
            System.out.println(zenbakiak[zenbatgarren]);
        } catch (Exception ex) {
            System.out.println("Ez duzu balio egokia sartu.");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
        in.close();
    }
}
