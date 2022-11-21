package random;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        String[] izenak;

        Scanner in = new Scanner(System.in);

        System.out.print("Esan zenbat izenen artean izango da sosketa: ");
        int max =in.nextInt();
        izenak = new String[max];

        System.out.println("Sartu izenak espazioen bitartez bananduta.");

        for (int i = 0; i < izenak.length; i++) {
            izenak[i] = in.next();
        }

        System.out.println("");
        System.out.println("Sosketaren irabazlea:");
        System.out.println("...");

        int posizioa = (int)(Math.random() * max);
        System.out.println(izenak[posizioa]);

        in.close();
    }   
    
}
