package aceptaElReto;

import java.util.Scanner;

public class LaFiestaAburrida {
    public static void main(String[] args) {
        String[] izenak;
        int tamaina;

        Scanner in = new Scanner(System.in);
        tamaina = in.nextInt();

        tamaina *= 2;
        izenak = new String[tamaina*2];

        for(int i = 1; i <= izenak.length*2; i++){
            izenak[i] = in.next(); 
        }

        in.close();

        for(int i = 0; i < izenak.length; i++){
            if((i % 2) == 0){
                System.out.println("Hola, " + izenak[i]);
            }
        }
    }
}
