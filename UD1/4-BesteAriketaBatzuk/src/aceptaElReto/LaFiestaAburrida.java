package aceptaElReto;

import java.util.Scanner;

public class LaFiestaAburrida {
    public static void main(String[] args) {
        String[] izenak;
        int tamaina;

        Scanner in = new Scanner(System.in);
        tamaina = in.nextInt();

        izenak = new String[tamaina];

        for(int i = 0; i < izenak.length; i++){
            in.next();
            izenak[i] = in.next();
        }

        in.close();

        for(int i = 0; i < izenak.length; i++){
            System.out.println("Hola, " + izenak[i] + ".");
        }
    }
}
