package mathRandom;

import java.util.Scanner;


public class Jolasa {
    public static void main(String[] args) {
        int zenbakia = (int)(Math.random()*100+1);
        int erantzuna=0;
        int kont = 0;
        
        System.out.println("Saiatu nik pentsatutako zenbakia asmatzen.");
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Sartu zenbaki bat: ");
            erantzuna = in.nextInt();
            System.out.println("");
            if(erantzuna > zenbakia){
                System.out.println("Nik pentsatutako zenbakia txikiagoa da.");
            }else if(erantzuna < zenbakia){
                System.out.println("Nik pentsatutako zenbakia handiagoa da.");
            } else {
                System.out.println("Zenbakia asmatu duzu!");
                System.out.println("ZORIONAK!!");
                System.out.println("***************************");
                System.out.println("*                         *");
                System.out.println("*   Zenbakia:" + zenbakia + "            *");
                System.out.println("*                         *");
                System.out.println("***************************");
            }
            kont++;
        }while(erantzuna != zenbakia);
        System.out.println(kont + " intento behar izan dituzu.");

        in.close();
    }
}
