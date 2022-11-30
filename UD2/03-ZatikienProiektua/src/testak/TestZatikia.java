package testak;

import java.util.Scanner;

import model.Zatikia;

public class TestZatikia {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia(5, 10);
        Zatikia zat2;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu zat2: ");
        zat2 = new Zatikia(in.next());
        System.out.println("");

        System.out.println("Zat1: " + zat1);
        System.out.println("Zat2: " + zat2);

        /*STRING */
        System.out.println("");

        /*BESTELAKO METODOAK */
        System.out.println("Biderketa: " + Zatikia.biderkatu(zat1, zat2));
        System.out.println("Batuketa return-ekin: " + Zatikia.batu(zat1, zat2));
        zat1.batu(zat2);
        System.out.println("Batuketa void metodoarekin: " + zat1);
        System.out.println("zat1-en hamartar baliokidea: " + zat1.hamartarBaliokidea());


        in.close();

    }
}
